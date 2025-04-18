package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ObterProduto {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 

		int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b); 

		System.out.println("O produto da lista: " + produto);
	}

}
