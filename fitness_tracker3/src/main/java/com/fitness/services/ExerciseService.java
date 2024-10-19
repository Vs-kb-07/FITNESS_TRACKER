package com.fitness.services;
import com.fitness.entities.Exercise;
import java.util.List;

public interface ExerciseService {

	    Exercise createExercise(Exercise exercise);
	    List<Exercise> getAllExercises();
	    Exercise getExerciseById(Long id);
	    Exercise updateExercise(Long id, Exercise exercise);
	    void deleteExercise(Long id);
	}


