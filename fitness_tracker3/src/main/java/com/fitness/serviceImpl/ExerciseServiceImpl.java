package com.fitness.serviceImpl;
import com.fitness.entities.Exercise;
import com.fitness.repository.ExerciseRepository;
import com.fitness.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	    @Autowired
	    private ExerciseRepository exerciseRepository;

	    @Override
	    public Exercise createExercise(Exercise exercise) {
	        return exerciseRepository.save(exercise);
	    }

	    @Override
	    public List<Exercise> getAllExercises() {
	        return exerciseRepository.findAll();
	    }

	    @Override
	    public Exercise getExerciseById(Long id) {
	        return exerciseRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Exercise not found"));
	    }

	    @Override
	    public Exercise updateExercise(Long id, Exercise exerciseDetails) {
	        Exercise exercise = getExerciseById(id);
	        exercise.setExerciseName(exerciseDetails.getExerciseName());
	        exercise.setReps(exerciseDetails.getReps());
	        exercise.setSets(exerciseDetails.getSets());
	        return exerciseRepository.save(exercise);
	    }

	    @Override
	    public void deleteExercise(Long id) {
	        Exercise exercise = getExerciseById(id);
	        exerciseRepository.delete(exercise);
	    }
	}


