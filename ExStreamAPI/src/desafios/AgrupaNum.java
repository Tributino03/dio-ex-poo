package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AgrupaNum {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> pares = numero-> numero % 2 == 0;
		
		List<Integer> numPares = numeros.stream()
								.filter(pares)
								.toList();
		
		Predicate<Integer> impares = numero-> numero % 2 != 0;
		
		List<Integer> numImpares = numeros.stream()
				.filter(impares)
				.toList();
		
		System.out.println(numPares);
		System.out.println("============================");
		System.out.println(numImpares);
	}

}
