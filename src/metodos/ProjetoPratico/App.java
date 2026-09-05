package metodos.ProjetoPratico;

public class App {
    public static void main(String[]args){

        SmartTv smartTv = new SmartTv();


        System.out.println("a TV ta ligada : "+smartTv.ligada);
        System.out.println("Canal sem parametro: "+smartTv.canal);

        smartTv.mudarCanal(14);
        System.out.println("Canal parametro: "+smartTv.canal);

        System.out.println("Volume Atual: " +smartTv.volume);

        System.out.println("\n");

        smartTv.ligar();
        System.out.println("Novo status -> TV  ligada ? "+smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual: "+smartTv.canal);


        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume Atual: " +smartTv.volume);




    }



}
