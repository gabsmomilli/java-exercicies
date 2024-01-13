package EstruturaSequencial2;

import java.util.Scanner;

public class Pescador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double multa;
        double pesoExcesso;

        System.out.println("Informe a quantidade de quilos que Joao pescou hoje: ");
        double peso = leitor.nextDouble();

        if (peso > 50.0){
            pesoExcesso = peso - 50.0;
            multa = pesoExcesso * 4.0;
            System.out.println("Joao deve pagar um total de " +multa
            + " pois pescou "+pesoExcesso+" a mais do que estabelecido pelo regulamento do estado ");
        }
    }
}
