package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificaNumNegatibo {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		Predicate<Integer> negativos = numero -> numero < 0;
		
		boolean numNegativos = numeros.stream().anyMatch(negativos);
		
		if(numNegativos) {
			System.out.println("Tem numeros negativos na lista");
		}else {
			System.out.println("Nao tem numeros negativos na lista");
		}

	}

}
