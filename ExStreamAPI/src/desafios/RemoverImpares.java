package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoverImpares {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> removerNumImpares = numero -> numero % 2 == 0;
		
		List<Integer> numerosPares = new ArrayList<>();
		
		numeros.stream()
		.filter(removerNumImpares)
		.toList()
		.forEach(System.out::println);;

	}

}
