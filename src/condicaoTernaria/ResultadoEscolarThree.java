package condicaoTernaria;

public class ResultadoEscolarThree {
    public static void main(String[]args){
        int nota = 5;
        String r = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ?"Recuperacao": "Reprovado";
        System.out.println(r);
    }
}
