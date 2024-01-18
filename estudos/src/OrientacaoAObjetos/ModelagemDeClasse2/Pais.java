package OrientacaoAObjetos.ModelagemDeClasse2;

import java.util.List;

public class Pais {
    private String nome;
    private String extensaoTerritorial;
    private Integer populacao;

    public Pais(){}

    public Pais(String nome, String extensaoTerritorial, Integer populacao) {
        this.nome = nome;
        this.extensaoTerritorial = extensaoTerritorial;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExtensaoTerritorial() {
        return extensaoTerritorial;
    }

    public void setExtensaoTerritorial(String extensaoTerritorial) {
        this.extensaoTerritorial = extensaoTerritorial;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public void exibirInformacoes(List<Pais> continente) {
        System.out.println("Liste os paises: ");
        for(Pais pais: continente){
            System.out.println("- " + pais.getNome());
        }
    }
}
