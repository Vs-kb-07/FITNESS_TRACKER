package com.fitness.controller;
import com.fitness.entities.Workout;
import com.fitness.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

	

	    @Autowired
	    private WorkoutService workoutService;

	    // Create a new workout
	    @PostMapping
	    public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
	        Workout savedWorkout = workoutService.createWorkout(workout);
	        return ResponseEntity.ok(savedWorkout);
	    }

	    // Get all workouts
	    @GetMapping
	    public ResponseEntity<List<Workout>> getAllWorkouts() {
	        List<Workout> workouts = workoutService.getAllWorkouts();
	        return ResponseEntity.ok(workouts);
	    }

	    // Get a workout by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Workout> getWorkoutById(@PathVariable Long id) {
	        Workout workout = workoutService.getWorkoutById(id);
	        return ResponseEntity.ok(workout);
	    }

	    // Update a workout
	    @PutMapping("/{id}")
	    public ResponseEntity<Workout> updateWorkout(@PathVariable Long id, @RequestBody Workout workoutDetails) {
	        Workout updatedWorkout = workoutService.updateWorkout(id, workoutDetails);
	        return ResponseEntity.ok(updatedWorkout);
	    }

	    // Delete a workout
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteWorkout(@PathVariable Long id) {
	        workoutService.deleteWorkout(id);
	        return ResponseEntity.noContent().build();
	    }
	}


