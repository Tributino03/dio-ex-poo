package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarNumPositivos {

	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Predicate<Integer> verificaNumPositivos = numero -> numero > 0;
        
        boolean todosPositivos = numeros.stream().allMatch(verificaNumPositivos);

        if (todosPositivos) {
            System.out.println("Todos os números são positivos.");
        } else {
            System.out.println("A lista contém números negativos.");
        }
	}  
}
