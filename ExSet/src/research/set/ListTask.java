package research.set;

import java.util.HashSet;
import java.util.Set;

public class ListTask {
	
	private Set <Task> taskSet;

	public ListTask() {
		this.taskSet = new HashSet<>();
	}
	
	public void addTask(String description) {
		taskSet.add(new Task(description));
	}
	
	public void removeTask(String description) {
		String taskRemoved = null;
		for(Task t : taskSet){
			if(t.getDescription().equalsIgnoreCase(description)) {
				taskRemoved = description;
			}
		}
		taskSet.remove(taskRemoved);
	}
	
	public void viewTasks() {
		if (taskSet.isEmpty()) {
	        throw new IllegalStateException("The list is empty");
	    }
		System.out.println(taskSet);
	}
	
	public int countTasks() {
		return taskSet.size();
	}
	
	public Set<Task> getCompletedTasks() {
		Set<Task> taskCompleted = new HashSet<>();
		for(Task t : taskSet) {
			if(t.getTaskCompleted() == true) {
				taskCompleted.add(t);
			}
		}
		return taskCompleted;
	}
	
	public Set<Task> getTasksPending(){
		Set<Task> taskPending = new HashSet<>();
		for(Task t : taskSet) {
			if(t.getTaskCompleted() == false) {
				taskPending.add(t);
			}
		}
		return taskPending;
	}
	
	public void markTaskCompleted(String description) {
		for(Task t : taskSet) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				t.setTaskCompleted(true);;
			}
		}
	}
	
	public void markTaskPending(String description) {
		for(Task t : taskSet) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				t.setTaskCompleted(false);;
			}
		}
	}
	
	public void removeTaskAll() {
		taskSet.clear();
	}
	
	public static void main(String[] args) {
		ListTask listTask = new ListTask();
		listTask.addTask("Clean the room");
		listTask.addTask("Clean the toilet");
		listTask.addTask("Clean the living room");
		listTask.addTask("Clean the room2");
		listTask.addTask("Walking the dog");
		listTask.viewTasks();
		listTask.removeTask("Clean the room2");
		listTask.markTaskCompleted("Clean the room");
		listTask.markTaskCompleted("Walking the dog");
		System.out.println("Task completeds: " + listTask.getCompletedTasks());
		listTask.markTaskPending("Clean the room");
		System.out.println("Task completeds: " + listTask.getCompletedTasks());
		System.out.println("Task pendings: " + listTask.getTasksPending());
		listTask.removeTaskAll();
		listTask.viewTasks();
	}
}
