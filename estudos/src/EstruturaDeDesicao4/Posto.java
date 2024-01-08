package EstruturaDeDesicao4;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double gasolina = 2.5;
        double alcool = 1.9;
        double precoComDesconto;
        double preco;

        System.out.println("Informe o tipo de combustivel (A-alcool, G-gasolina) ");
        String tipoCombustivel = leitor.next().toUpperCase();


        System.out.println("Informe a quantidade de combustivel desejada: ");
        double qntdLitros = leitor.nextDouble();

        if (tipoCombustivel.equals("A")){
            if (qntdLitros <= 20){
                preco = alcool * qntdLitros;
                precoComDesconto = preco - (preco * 0.03);
                System.out.println("valor cheio: R$"+ preco+
                        "\nvalor com desconto de 3%: R$"+ precoComDesconto);
            }else if (qntdLitros > 20){
                preco = alcool *qntdLitros;
                precoComDesconto = preco - (preco * 0.05);
                System.out.println("valor cheio: R$"+ preco+
                        "\nvalor com desconto de 5%: R$"+ precoComDesconto);
            }
        }else if (tipoCombustivel.equals("G")) {
            if (qntdLitros <= 20) {
                preco = gasolina * qntdLitros;
                precoComDesconto = preco - (preco * 0.04);
                System.out.println("valor cheio: R$"+ preco+
                        "\nvalor com desconto de 4%: R$"+ precoComDesconto);
            } else if (qntdLitros > 20) {
                preco = gasolina * qntdLitros;
                precoComDesconto = preco - (preco * 0.06);
                System.out.println("valor cheio: R$"+ preco+
                        "\nvalor com desconto de 6%: R$"+ precoComDesconto);
            }
        }
    }
}
