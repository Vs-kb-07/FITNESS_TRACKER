package com.fitness.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String email;
	    private String password;

	    // One-to-Many relationship with Workout
	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private List<Workout> workouts;

	    // One-to-One relationship with Goal
	    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	    private Goal goal;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(Long id, String name, String email, String password, List<Workout> workouts, Goal goal) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.workouts = workouts;
			this.goal = goal;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", workouts="
					+ workouts + ", goal=" + goal + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Workout> getWorkouts() {
			return workouts;
		}

		public void setWorkouts(List<Workout> workouts) {
			this.workouts = workouts;
		}

		public Goal getGoal() {
			return goal;
		}

		public void setGoal(Goal goal) {
			this.goal = goal;
		}

	    // Getters and Setters
	    
	}


