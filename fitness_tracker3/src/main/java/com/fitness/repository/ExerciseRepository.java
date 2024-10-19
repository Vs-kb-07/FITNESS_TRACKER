package com.fitness.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fitness.entities.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

	

}
