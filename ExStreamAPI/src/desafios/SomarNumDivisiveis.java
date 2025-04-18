package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SomarNumDivisiveis {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> numDivisiveis = numero-> numero % 3 == 0 || numero % 5 == 0;
		
		int somaNumDivisiveis = numeros.stream()
								.filter(numDivisiveis)
								.mapToInt(Integer::intValue)
								.sum();
		
		System.out.println(somaNumDivisiveis);

	}

}
