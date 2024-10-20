package com.fitness.controller;
import com.fitness.entities.Goal;
import com.fitness.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

	    @Autowired
	    private GoalService goalService;

	    // Create a new goal
	    @PostMapping
	    public ResponseEntity<Goal> createGoal(@RequestBody Goal goal) {
	        Goal savedGoal = goalService.createGoal(goal);
	        return ResponseEntity.ok(savedGoal);
	    }

	    // Get all goals
	    @GetMapping
	    public ResponseEntity<List<Goal>> getAllGoals() {
	        List<Goal> goals = goalService.getAllGoals();
	        return ResponseEntity.ok(goals);
	    }

	    // Get a goal by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Goal> getGoalById(@PathVariable Long id) {
	        Goal goal = goalService.getGoalById(id);
	        return ResponseEntity.ok(goal);
	    }

	    // Update a goal
	    @PutMapping("/{id}")
	    public ResponseEntity<Goal> updateGoal(@PathVariable Long id, @RequestBody Goal goalDetails) {
	        Goal updatedGoal = goalService.updateGoal(id, goalDetails);
	        return ResponseEntity.ok(updatedGoal);
	    }

	    // Delete a goal
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteGoal(@PathVariable Long id) {
	        goalService.deleteGoal(id);
	        return ResponseEntity.noContent().build();
	    }
	}


