package com.fitness.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fitness.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


	}


