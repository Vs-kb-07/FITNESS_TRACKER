package com.fitness.entities;
import jakarta.persistence.*;

@Entity
public class Goal {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String description;
	    private int target;  // e.g. 5kg weight loss
	    private int progress;

	    // One-to-One relationship with User
	    @OneToOne
	    @JoinColumn(name = "user_id")
	    private User user;

		public Goal() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Goal(Long id, String description, int target, int progress, User user) {
			super();
			this.id = id;
			this.description = description;
			this.target = target;
			this.progress = progress;
			this.user = user;
		}

		@Override
		public String toString() {
			return "Goal [id=" + id + ", description=" + description + ", target=" + target + ", progress=" + progress
					+ ", user=" + user + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getTarget() {
			return target;
		}

		public void setTarget(int target) {
			this.target = target;
		}

		public int getProgress() {
			return progress;
		}

		public void setProgress(int progress) {
			this.progress = progress;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

	    // Getters and Setters
	    
	}


