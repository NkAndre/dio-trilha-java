package exemploSwitchCase;

public class PlanoTelefonico {
    public static void main(String[]args){
        String plano = "m";

        switch (plano){
            case "b":{
                System.out.println("100 min de ligação");
                break;
            }
            case "m":{
                System.out.println("100 min de ligação");
                System.out.println("whats e instagram gratis");
                break;
            }
            case "t":{
                System.out.println("100 min de ligação");
                System.out.println("whats instagram gratis");
                System.out.println("5gb de youtube");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
