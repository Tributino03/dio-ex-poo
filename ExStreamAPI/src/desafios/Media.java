package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Media {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> maioresQueCinco = numero -> numero > 5;
		
		OptionalDouble media = numeros.stream()
		.filter(maioresQueCinco)
		.mapToInt(Integer::intValue)
		.average();
		
		if (media.isPresent()) {
		    System.out.println("Média: " + media.getAsDouble());
		} else {
		    System.out.println("Nenhum número maior que 5.");
		}
	}

}
