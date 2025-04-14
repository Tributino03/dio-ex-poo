package research.set;

public class Task {

	private String description;
	Boolean taskCompleted;
	
	public Task(String description) {
		this.description = description;
		this.taskCompleted = false;
	}
	
	public String getDescription() {
		return description;
	}

	public void setTaskCompleted(Boolean taskCompleted) {
		this.taskCompleted = taskCompleted;
	}

	public Boolean getTaskCompleted() {
		return taskCompleted;
	}

	@Override
	public String toString() {
		return "Tarefa [description=" + description + ", taskCompleted=" + taskCompleted + "]";
	}
	
}
