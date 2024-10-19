package com.fitness.services;
import com.fitness.entities.Goal;
import java.util.List;

public interface GoalService {

	    Goal createGoal(Goal goal);
	    List<Goal> getAllGoals();
	    Goal getGoalById(Long id);
	    Goal updateGoal(Long id, Goal goal);
	    void deleteGoal(Long id);
	}


