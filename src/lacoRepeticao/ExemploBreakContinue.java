package lacoRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int n = 1; n<=5;n++){
            if(n==4){
                break; // para a aplicacao
                //continue; muda so o fluxo, mas nao para a aplicacao
            }
            System.out.println(n);
        }
    }
}
