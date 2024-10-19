package com.fitness.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Exercise {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String exerciseName;
	    private int sets;
	    private int reps;

	    // Many-to-Many relationship with Workout
	    @ManyToMany(mappedBy = "exercises")
	    private List<Workout> workouts;

		public Exercise() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Exercise(Long id, String exerciseName, int sets, int reps, List<Workout> workouts) {
			super();
			this.id = id;
			this.exerciseName = exerciseName;
			this.sets = sets;
			this.reps = reps;
			this.workouts = workouts;
		}

		@Override
		public String toString() {
			return "Exercise [id=" + id + ", exerciseName=" + exerciseName + ", sets=" + sets + ", reps=" + reps
					+ ", workouts=" + workouts + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getExerciseName() {
			return exerciseName;
		}

		public void setExerciseName(String exerciseName) {
			this.exerciseName = exerciseName;
		}

		public int getSets() {
			return sets;
		}

		public void setSets(int sets) {
			this.sets = sets;
		}

		public int getReps() {
			return reps;
		}

		public void setReps(int reps) {
			this.reps = reps;
		}

		public List<Workout> getWorkouts() {
			return workouts;
		}

		public void setWorkouts(List<Workout> workouts) {
			this.workouts = workouts;
		}

	    // Getters and Setters
	    
	}


