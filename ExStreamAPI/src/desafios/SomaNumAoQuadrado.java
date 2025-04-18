package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SomaNumAoQuadrado {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		Function<Integer, Integer> quadrado = numero -> numero * numero;
		
		int numQuadrado = numeros.stream()
						  .map(quadrado)
						  .mapToInt(Integer::intValue)
						  .sum();	
		
		System.out.println("Soma dos numeros da lista ao quadrado: " + numQuadrado);
	}

}
