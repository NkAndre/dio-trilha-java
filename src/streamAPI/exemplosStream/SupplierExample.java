package streamAPI.exemplosStream;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> gerarNumero = () -> 10;

        System.out.println(gerarNumero.get());
    }


}
