package ordination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdinationNumbers{
	private List<Integer> numbers;
	
	public List<Integer> getNumbers() {
		return numbers;
	}
	
	public OrdinationNumbers(){
		this.numbers = new ArrayList();
	}
	
	public void addNumber(int num) {
		numbers.add(num);
	}
	
	public List<Integer> sortAscendant() {
		if (numbers.isEmpty()) {
	        throw new IllegalStateException("A lista está vazia!");
	    }
		List<Integer> ascNumbers = new ArrayList(numbers);
		Collections.sort(ascNumbers);
		return ascNumbers;
	}
	
	public List<Integer> sortDescendant() {
		if (numbers.isEmpty()) {
	        throw new IllegalStateException("A lista está vazia!");
	    }
		List<Integer> descNumbers = new ArrayList(numbers);
		Collections.sort(descNumbers, Collections.reverseOrder());
		return descNumbers;
	}
	
	public static void main(String[] args) {
		OrdinationNumbers o = new OrdinationNumbers();
		
		o.addNumber(10);
		o.addNumber(7);
		o.addNumber(3);
		o.addNumber(5);
		o.addNumber(-5);
		System.out.println("Ascending Order: " + o.sortAscendant());
		System.out.println("Descending Order: " + o.sortDescendant());
	}
}
