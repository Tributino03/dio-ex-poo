package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SomaNumeros {

	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        BinaryOperator<Integer>somaPares =(num1, num2) -> num1 + num2;
        int resultado = numeros.stream()
        		.filter(numero -> numero % 2 == 0)
        		.reduce(0, somaPares);
        
        System.out.println("Soma dos pares: " + resultado);
        };
        
}
