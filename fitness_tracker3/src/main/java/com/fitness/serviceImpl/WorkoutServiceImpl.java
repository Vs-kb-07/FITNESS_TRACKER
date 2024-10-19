package com.fitness.serviceImpl;
import com.fitness.entities.Workout;
import com.fitness.repository.WorkoutRepository;
import com.fitness.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService{


	    @Autowired
	    private WorkoutRepository workoutRepository;

	    @Override
	    public Workout createWorkout(Workout workout) {
	        return workoutRepository.save(workout);
	    }

	    @Override
	    public List<Workout> getAllWorkouts() {
	        return workoutRepository.findAll();
	    }

	    @Override
	    public Workout getWorkoutById(Long id) {
	        return workoutRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Workout not found"));
	    }

	    @Override
	    public Workout updateWorkout(Long id, Workout workoutDetails) {
	        Workout workout = getWorkoutById(id);
	        workout.setWorkoutName(workoutDetails.getWorkoutName());
	        workout.setDuration(workoutDetails.getDuration());
	        workout.setCaloriesBurned(workoutDetails.getCaloriesBurned());
	        workout.setWorkoutDate(workoutDetails.getWorkoutDate());
	        return workoutRepository.save(workout);
	    }

	    @Override
	    public void deleteWorkout(Long id) {
	        Workout workout = getWorkoutById(id);
	        workoutRepository.delete(workout);
	    }
	}


