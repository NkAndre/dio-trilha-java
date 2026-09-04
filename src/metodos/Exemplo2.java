package metodos;

public class Exemplo2 {
    public static void main(String[]args){
        Exemplo2 exemplo = new Exemplo2();
        double resultado =exemplo.somar(10,30);

        System.out.println(resultado);
    }


    public double somar(double nm1,double nm2){

    double r = nm1 +nm2;

    return r;
    }

}
