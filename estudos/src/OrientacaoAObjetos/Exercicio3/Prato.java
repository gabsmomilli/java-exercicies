package OrientacaoAObjetos.Exercicio3;

import java.util.List;

public class Prato {
    private String nome;
    private List<Ingrediente> ingredientes;

    public Prato() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Prato(String nome, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }
}
