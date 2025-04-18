package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FiltarNum {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		Predicate<Integer> filtrados = numero -> numero > 5 && numero < 10;
		
		List<Integer> numFiltrados = numeros.stream()
				           .filter(filtrados)
				           .toList();
		
		System.out.println(numFiltrados);
	}      

}
