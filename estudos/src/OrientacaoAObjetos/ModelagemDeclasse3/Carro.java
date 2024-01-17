package OrientacaoAObjetos.ModelagemDeclasse3;

import java.util.Scanner;

public class Carro {
    private String nome;
    private Double peso;
    private String fabricante;
    private String cor;
    private Double valor;

    public Carro(){}

    public Carro(String nome, Double peso, String fabricante, String cor, Double valor) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void darDesconto() {
        if (valor >= 100000 & cor.equals("vermelho")){
            double desconto = valor * 0.2;
            double novoPreco = valor - desconto;
            System.out.println("- valor cheio: "+ valor +
                    "\n- valor do desconto: " + desconto +
                    "\n- valor final: " + novoPreco);
        }
    }
    public void pintar(Scanner leitor) {
        System.out.println("Informe a cor no qual deseja trocar pela " + cor);
        String novaCor = leitor.next();
        cor = novaCor;
    }
}
