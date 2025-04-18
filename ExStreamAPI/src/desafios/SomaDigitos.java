package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SomaDigitos {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		int somaDigitos = numeros.stream()
			    .flatMapToInt(numero -> String.valueOf(numero) // transforma cada elemento da stream original em um IntStream (uma stream de inteiros primitivos) e depois achata tudo em uma única IntStream.
			    .chars() // cria um IntStream com os códigos ASCII dos caracteres
			    .map(c -> Character.getNumericValue(c))) // transforma os códigos em valores numéricos reais
			    .sum();
		
		System.out.println(somaDigitos);
	}
}
