package com.fitness.serviceImpl;
import com.fitness.entities.User;
import com.fitness.repository.UserRepository;
import com.fitness.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{


	    @Autowired
	    private UserRepository userRepository;

	    @Override
	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public User getUserById(Long id) {
	        return userRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("User not found"));
	    }

	    @Override
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }

	    @Override
	    public User updateUser(Long id, User user) {
	        User existingUser = getUserById(id);
	        existingUser.setName(user.getName());
	        existingUser.setEmail(user.getEmail());
	        existingUser.setPassword(user.getPassword());
	        return userRepository.save(existingUser);
	    }
	}


