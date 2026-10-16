package fundamentosCollections.src.set.pesquisa;

import java.util.Objects;

public class Contato {
    private  String nome ;
    private  int numero;

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Contato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
