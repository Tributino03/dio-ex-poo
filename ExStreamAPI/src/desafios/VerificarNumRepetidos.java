package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerificarNumRepetidos {

public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
		
		List<Integer> semNumRepetidos = numeros.stream()
                					.distinct()
                					.collect(Collectors.toList());

		if(semNumRepetidos.size() < numeros.size()) {
			System.out.println("Essa lista contém números repetidos");
		}else {
			System.out.println("Essa lista nao contém números repetidos");
		}
	}
}
