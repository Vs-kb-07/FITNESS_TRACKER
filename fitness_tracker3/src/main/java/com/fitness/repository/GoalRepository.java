package com.fitness.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fitness.entities.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long>  {

	

}
