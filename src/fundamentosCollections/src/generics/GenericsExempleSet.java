package fundamentosCollections.src.generics;
import java.util.HashSet;
import java.util.Set;
public class GenericsExempleSet {
    public static void main(String[] args) {

        //exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
      //  conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        //exemplo com generics

        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("elemento 1");
        conjuntoGenerics.add("elemento 2");
        conjuntoGenerics.add("elemento 3");


        // Iterando sobre o conjunto com Generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }

        // Iterando sobre o conjunto sem Generics

        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }




    }
}
