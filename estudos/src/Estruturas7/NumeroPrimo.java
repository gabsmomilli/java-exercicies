package Estruturas7;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int divisao;

        System.out.println("Informe um numero: ");
        int n = leitor.nextInt();

        divisao = n / n;
        if (divisao == 1){
            System.out.println("Este numero é primo.");
        }
        if(divisao != 1){
            System.out.println("Este numero NAO é primo");
        }
    }
}
