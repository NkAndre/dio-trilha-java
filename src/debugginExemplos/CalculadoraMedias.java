package debugginExemplos;

import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alunos [] = {"André" , "Matheus", "Maria" , "Luisa"};
        double media=calcularMediaTurma(alunos,sc);
        System.out.printf("media da turma %.1f  " , media);



    }

    public static double calcularMediaTurma(String[]alunos, Scanner scanner){
        double soma =  0;
        for (String aluno : alunos){
            System.out.printf("Nota dos alunos %s: " , aluno);
            double nota = scanner.nextDouble();
            soma+=nota;
        }
        return soma / alunos.length;
    }
}
