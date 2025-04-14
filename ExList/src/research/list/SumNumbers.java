package research.list;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
	
	private List<Integer> numbers;

	public SumNumbers(int numero) {
		this.numbers = new ArrayList();
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void addNumber(int numero) {
		numbers.add(numero);
	}
	
	public int calculateSum() {
		if (numbers.isEmpty()) {
	        throw new IllegalStateException("A lista está vazia!");
	    }
		int total = 0;
		for(Integer i : numbers) {
			total += i;
		}
		return total;
	}
	
	public int findHigherNumber() {
	    if (numbers.isEmpty()) {
	        throw new IllegalStateException("A lista está vazia!");
	    }

	    int higherNumber = numbers.get(0);
	    for (Integer i : numbers) {
	        if (i > higherNumber) {
	            higherNumber = i;
	        }
	    }
	    return higherNumber;
	}

	
	public int findMinorNumber() {
		if (numbers.isEmpty()) {
	        throw new IllegalStateException("A lista está vazia!");
	    }
		int minorNumber = numbers.get(0);
		for(Integer i : numbers) {
			 if(i < minorNumber) {
				minorNumber = i;
			}
		}
		return minorNumber;
	}
	
	public void viewNumbers() {
		System.out.println(numbers);
	}
	
	public static void main(String[] args) {
		SumNumbers sum = new SumNumbers(0);
	
		sum.addNumber(10);
		sum.addNumber(1);
		sum.addNumber(90);
		sum.addNumber(5);
		sum.addNumber(7);
		System.out.println("Summation of numbers: " + sum.calculateSum());
		System.out.println("Higher number: " + sum.findHigherNumber());
		System.out.println("Minor number: " + sum.findMinorNumber());
		sum.viewNumbers();
		
	}
}

	
	
	
