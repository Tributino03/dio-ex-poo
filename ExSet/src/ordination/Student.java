package ordination;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private String name;
	private long matricula;
	private double media;
	
	public Student(String name, long plate, double media) {
		super();
		this.name = name;
		this.matricula = plate;
		this.media = media;
	}
	
	@Override
	public int compareTo(Student student) {
		return this.name.compareToIgnoreCase(student.getName());
	}

	public String getName() {
		return name;
	}

	public long getPlate() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", plate=" + matricula + ", media=" + media + "]";
	}
	
}

class ComparatorByNote implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Double.compare(student1.getMedia(), student2.getMedia());
	}
	
}

