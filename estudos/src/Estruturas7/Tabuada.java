package Estruturas7;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int resultado;

        System.out.println("Informe o numero da tabuada que deseja ver: ");
        int numero = leitor.nextInt();

        for (int i = 0; i <= 10; i ++){
            resultado = numero * i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }

    }
}
