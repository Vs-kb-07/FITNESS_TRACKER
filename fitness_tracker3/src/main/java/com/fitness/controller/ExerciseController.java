package com.fitness.controller;
import com.fitness.entities.Exercise;
import com.fitness.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {


	    @Autowired
	    private ExerciseService exerciseService;

	    // Create a new exercise
	    @PostMapping
	    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
	        Exercise savedExercise = exerciseService.createExercise(exercise);
	        return ResponseEntity.ok(savedExercise);
	    }

	    // Get all exercises
	    @GetMapping
	    public ResponseEntity<List<Exercise>> getAllExercises() {
	        List<Exercise> exercises = exerciseService.getAllExercises();
	        return ResponseEntity.ok(exercises);
	    }

	    // Get an exercise by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id) {
	        Exercise exercise = exerciseService.getExerciseById(id);
	        return ResponseEntity.ok(exercise);
	    }

	    // Update an exercise
	    @PutMapping("/{id}")
	    public ResponseEntity<Exercise> updateExercise(@PathVariable Long id, @RequestBody Exercise exerciseDetails) {
	        Exercise updatedExercise = exerciseService.updateExercise(id, exerciseDetails);
	        return ResponseEntity.ok(updatedExercise);
	    }

	    // Delete an exercise
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteExercise(@PathVariable Long id) {
	        exerciseService.deleteExercise(id);
	        return ResponseEntity.noContent().build();
	    }
	}


