package OrientacaoAObjetos.ModelagemDeClasse;

public class Carro {
    private Integer qntdPortas;
    private String modelo;
    private String marca;
    private Double potencia;

    public Carro(Integer qntdPortas, String modelo, String marca, Double potencia) {
        this.qntdPortas = qntdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Carro(Integer qntdPortas, String modelo, String marca) {
        this.qntdPortas = qntdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes do carro: ");
        System.out.println("- Numero da portas: " + qntdPortas);
        System.out.println("- modelo: " + modelo);
        System.out.println("- marca: " + marca);
        System.out.println("- potencia: " + potencia + "\n");
    }
}
