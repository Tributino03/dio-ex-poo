package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OrdemNumerica {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Consumer<Integer> ordemCrescente = numero -> System.out.println(numero);

        numeros.stream().distinct().sorted().forEach(ordemCrescente);
    }
}
