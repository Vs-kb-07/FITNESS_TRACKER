package com.fitness.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Workout {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String workoutName;
	    private int duration; // in minutes
	    @Column(nullable = true)
	    private int caloriesBurned;
	    private LocalDate workoutDate;

	    // Many-to-One relationship with User
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    // Many-to-Many relationship with Exercise
	    @ManyToMany
	    @JoinTable(
	        name = "workout_exercise",
	        joinColumns = @JoinColumn(name = "workout_id"),
	        inverseJoinColumns = @JoinColumn(name = "exercise_id")
	    )
	    private List<Exercise> exercises;

		public Workout() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Workout(Long id, String workoutName, int duration, int caloriesBurned, LocalDate workoutDate, User user,
				List<Exercise> exercises) {
			super();
			this.id = id;
			this.workoutName = workoutName;
			this.duration = duration;
			this.caloriesBurned = caloriesBurned;
			this.workoutDate = workoutDate;
			this.user = user;
			this.exercises = exercises;
		}

		@Override
		public String toString() {
			return "Workout [id=" + id + ", workoutName=" + workoutName + ", duration=" + duration + ", caloriesBurned="
					+ caloriesBurned + ", workoutDate=" + workoutDate + ", user=" + user + ", exercises=" + exercises
					+ "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getWorkoutName() {
			return workoutName;
		}

		public void setWorkoutName(String workoutName) {
			this.workoutName = workoutName;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public int getCaloriesBurned() {
			return caloriesBurned;
		}

		public void setCaloriesBurned(int caloriesBurned) {
			this.caloriesBurned = caloriesBurned;
		}

		public LocalDate getWorkoutDate() {
			return workoutDate;
		}

		public void setWorkoutDate(LocalDate workoutDate) {
			this.workoutDate = workoutDate;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List<Exercise> getExercises() {
			return exercises;
		}

		public void setExercises(List<Exercise> exercises) {
			this.exercises = exercises;
		}

		
	    // Getters and Setters
	    
	}

