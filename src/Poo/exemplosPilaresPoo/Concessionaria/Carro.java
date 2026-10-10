package Poo.exemplosPilaresPoo.Concessionaria;

public class Carro extends Veiculo {
    private String chasse;

    public String getChasse(){
        return chasse;
    }

    public void setChasse(String chasse) {
        this.chasse = chasse;
    }

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO ");
    }

    public void confereCombustivel(){
        System.out.println("conferindo combustivel ");
    }

    public void confereCambio(){
        System.out.println("conferindo combioo ");
    }


}
