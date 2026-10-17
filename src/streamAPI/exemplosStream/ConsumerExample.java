package streamAPI.exemplosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer>  numeros = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> imprimirNumero = numero ->
                System.out.println(numero);



        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(imprimirNumero);

    }

}
