package ordination;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration{
	
	private Set<Student> listStudents;

	public ProductRegistration() {
		this.listStudents = new HashSet<>();
	}
	
	public void addStudent(String name, Long plate, double media) {
		listStudents.add(new Student(name, plate, media));
	}
	
	public void removeStudent(Long plate) {
		if (listStudents.isEmpty()) {
	        throw new ListEmptyException("The list of students is empty.");
	    }
		Set<Student> studentRemoved = new HashSet<>();
		for(Student student : listStudents) {
			if(student.getPlate() == plate) {
				studentRemoved.add(student);
				break;
			}
		}
		listStudents.remove(studentRemoved);
	}
	
	public Set<Student> viewStudentsByName(){
		if (listStudents.isEmpty()) {
	        throw new ListEmptyException("The list of students is empty.");
	    }
		Set<Student> studentsByName = new TreeSet<>(listStudents);
		return studentsByName;
		
	}
	
	public Set<Student> vieStudentswByNote(){
		if (listStudents.isEmpty()) {
	        throw new ListEmptyException("The list of students is empty.");
	    }
		Set<Student> studentsByNote = new TreeSet<>(new ComparatorByNote());
		studentsByNote.addAll(listStudents);
		return studentsByNote;
	}
	
	public void viewStudents() {
		if (listStudents.isEmpty()) {
	        throw new ListEmptyException("The list of students are empty.");
	    }
		System.out.println(listStudents);
	}
	
	public static void main(String[] args) {
		ProductRegistration student = new ProductRegistration();
		/*student.viewStudents();*/
		student.addStudent("Joao", 1929292929L, 8);
		student.addStudent("Pedro", 19893593589L, 9);
		student.addStudent("Augusto", 193249439040L, 4);
		student.addStudent("Joaquim", 1404000L, 5);
		student.addStudent("Joelinton", 13490349340L, 7);
		student.addStudent("Zyon", 134943043040L, 7.5);
		student.viewStudents();
		System.out.println("==============================");
		student.removeStudent(1404000L);
		System.out.println(student.vieStudentswByNote());
		System.out.println("==============================");
		System.out.println(student.viewStudentsByName());
	}
}
