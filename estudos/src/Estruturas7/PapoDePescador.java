package Estruturas7;

import java.util.Scanner;

public class PapoDePescador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double multaPorKg = 0.0;
        double kgSobra = 0.0;

        System.out.println("Informe quantos kg Joao pescou hoje: ");
        double kgDePeixe = leitor.nextDouble();

        if (kgDePeixe <= 50){
            System.out.println("Parabens pela pesca!");
        }else if (kgDePeixe > 50 ){
            kgSobra = kgDePeixe - 50;
            multaPorKg = 4.0 * kgSobra;
        }
        System.out.println("Pescado: "+kgDePeixe+
                "\nKg excedente: "+kgSobra+
                "\nMulta total: "+multaPorKg);
    }
}
