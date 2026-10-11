package fundamentosCollections.src.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        //exemplo sem generics

        List listSemGenerics =new ArrayList<>();

        listSemGenerics.add("elemento1");

       // listSemGenerics.add(10);

        //exemplo com generics

        List<String> listaComGenerics =new ArrayList<>();
        listaComGenerics.add("elemento1");
        listaComGenerics.add("elemento2");

        //iterando sobre a lista com generics

        for(String elemento : listaComGenerics){
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)

        for(Object elemento : listSemGenerics){
            String str = (String) elemento;
            System.out.println(elemento);
        }

    }
}
