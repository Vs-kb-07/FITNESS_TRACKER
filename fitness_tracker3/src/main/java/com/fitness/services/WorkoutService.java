package com.fitness.services;
import com.fitness.entities.Workout;
import java.util.List;
public interface WorkoutService {

	    Workout createWorkout(Workout workout);
	    List<Workout> getAllWorkouts();
	    Workout getWorkoutById(Long id);
	    Workout updateWorkout(Long id, Workout workout);
	    void deleteWorkout(Long id);
	}


