package OrientacaoAObjetos.Exercicio3;

public class Ingrediente {
    private String nome;
    private String porcao;

    public Ingrediente(String nome, String porcao) {
        this.nome = nome;
        this.porcao = porcao;
    }

    public Ingrediente() {
    }

    public String getNome() {
        return nome;
    }

    public String getPorcao() {
        return porcao;
    }
}
