package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarNumMaioresQueDez {
	
	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Predicate<Integer> num = numero -> numero > 10;
        
        boolean maioresQueDez = numeros.stream().allMatch(num);

        if (maioresQueDez) {
            System.out.println("A lista contém pelo menos um número maior que dez");
        } else {
            System.out.println("A lista nao contém números maiores que dez");
        }
	}  

}
