package Estruturas7;

import java.util.Scanner;

public class SomaImparesEmIntervalo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int resto;
        int aux;

        System.out.println("Informe o valor inicial de seu internalo: ");
        int x = leitor.nextInt();
        aux = x;
        System.out.println("Informe o valor final de seu internalo: ");
        int y = leitor.nextInt();

        if (y <= x ){
            System.out.println("Intervalo de valores invalido.");
        }else {
            while(x <= y ){
                resto = x % 2;
                if (resto == 1){
                    soma = soma + x;
                }
                x++;
            }
        }
        System.out.println("A soma de todos os valores impares entre "
                +aux+" e "+y+" é de "+soma);
    }
}
