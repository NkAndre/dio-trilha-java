package Poo.exemplosPilaresPoo.IphoneUml.src;

public class IPhone implements
        ReprodutorMusical,
        AparelhoTelefonico,
        NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para : " +numero);

    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina : " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba sendo adicionada");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Musica");

    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);

    }
}