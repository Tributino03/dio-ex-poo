package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AgruparValoresImpares {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		Predicate<Integer> multiplos = numero -> numero % 3 == 0 || numero % 5 == 0;
		
		List<Integer> multiplo = numeros.stream()
					.filter(multiplos)
					.toList();
		
		System.out.println(multiplo);
		
	}

}
