package com.fitness.serviceImpl;
import com.fitness.entities.Goal;
import com.fitness.repository.GoalRepository;
import com.fitness.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalServiceImpl implements GoalService{

	    @Autowired
	    private GoalRepository goalRepository;

	    @Override
	    public Goal createGoal(Goal goal) {
	        return goalRepository.save(goal);
	    }

	    @Override
	    public List<Goal> getAllGoals() {
	        return goalRepository.findAll();
	    }

	    @Override
	    public Goal getGoalById(Long id) {
	        return goalRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Goal not found"));
	    }

	    @Override
	    public Goal updateGoal(Long id, Goal goalDetails) {
	        Goal goal = getGoalById(id);
	        goal.setDescription(goalDetails.getDescription());
	        goal.setTarget(goalDetails.getTarget());
	        goal.setProgress(goalDetails.getProgress());
	        return goalRepository.save(goal);
	    }

	    @Override
	    public void deleteGoal(Long id) {
	        Goal goal = getGoalById(id);
	        goalRepository.delete(goal);
	    }
	}


