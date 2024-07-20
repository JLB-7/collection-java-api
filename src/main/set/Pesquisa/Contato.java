package main.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributo
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome(){
        return nome;
    }
    public int getNumeroTelefone(){
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

  @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public String toString(){
        return "Contato {" +
        "nome='" + nome + '\'' +
        ", numero=" + numeroTelefone +
        '}';
    }
}
