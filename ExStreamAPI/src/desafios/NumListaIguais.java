package desafios;

import java.util.Arrays;
import java.util.List;

public class NumListaIguais {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		List<Integer> todosNumIguais = numeros.stream()
							.distinct()
							.toList();
		
		if(todosNumIguais.size() > 1) {
			System.out.println("Tem numeros diferentes na lista");
		}else {
			System.out.println("Todos os numeros da lista sao iguais");
		}

	}

}
