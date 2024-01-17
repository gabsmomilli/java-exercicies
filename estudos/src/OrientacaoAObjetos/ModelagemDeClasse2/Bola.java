package OrientacaoAObjetos.ModelagemDeClasse2;

public class Bola {
    private Double circunferencia;
    private String cor;
    private String marca;
    private Double velocidde;

    public Bola(){}

    public Bola(Double circunferencia, String cor, String marca, Double velocidde) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidde = velocidde;
    }

    public Double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(Double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getVelocidde() {
        return velocidde;
    }

    public void setVelocidde(Double velocidde) {
        this.velocidde = velocidde;
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes da bola: ");
        System.out.println("- Circunferencia: " + circunferencia + "cm");
        System.out.println("- Cor: "+ cor);
        System.out.println("- Marca: "+ marca);
        System.out.println("- Velocidade: "+ velocidde+"km\n");
    }
}
