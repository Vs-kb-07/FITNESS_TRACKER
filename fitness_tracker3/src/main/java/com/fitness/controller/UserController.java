package com.fitness.controller;
import com.fitness.entities.User;
import com.fitness.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {


	    @Autowired
	    private UserService userService;

	    // Create a new user
	    @PostMapping
	    public ResponseEntity<User> createUser(@RequestBody User user) {
	        User savedUser = userService.createUser(user);
	        return ResponseEntity.ok(savedUser);
	    }

	    // Get all users
	    @GetMapping
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = userService.getAllUsers();
	        return ResponseEntity.ok(users);
	    }

	    // Get user by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable Long id) {
	        User user = userService.getUserById(id);
	        return ResponseEntity.ok(user);
	    }

	    // Update user
	    @PutMapping("/{id}")
	    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
	        User updatedUser = userService.updateUser(id, user);
	        return ResponseEntity.ok(updatedUser);
	    }

	    // Delete user
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }
	}


