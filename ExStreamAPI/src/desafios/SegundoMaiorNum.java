package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SegundoMaiorNum {

	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Optional<Integer> segundoMaior = numeros.stream()
        .sorted((a,b) -> b - a)
        .skip(1)
        .findFirst();
        
        System.out.println("Segundo maior numero da lista: " + segundoMaior);
	}  
}
