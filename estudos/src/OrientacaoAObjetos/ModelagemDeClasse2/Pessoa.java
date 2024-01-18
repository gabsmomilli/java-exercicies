package OrientacaoAObjetos.ModelagemDeClasse2;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa (String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes da pessoa: ");
        System.out.println("- Nome: " + nome);
        System.out.println("- Idade: " + idade);
        System.out.println("- Altura: " + altura);
        System.out.println("- Peso: " + peso + "\n");
    }

    public void calcularIMC(){
       double imc = peso / (altura*2);
       if (imc < 18.5){
           System.out.println(nome + " esta a baixo do peso.");
       } else if (imc >= 18.5 | imc <= 24.9){
           System.out.println(nome + " esta com peso ideal.");
       } else if (imc >= 25 | imc <= 29.9){
           System.out.println(nome + " esta com sobrepeso.");
       } else if (imc > 30){
           System.out.println(nome + " esta com obesidade.");
       }
        System.out.println(imc + "\n");
    }
}
