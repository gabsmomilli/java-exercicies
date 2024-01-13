package Estruturas7;

import java.util.Scanner;

public class EntreDoisNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        System.out.println("Informe o primeiro numero: ");
        int x = leitor.nextInt();
        System.out.println("Informe o segundo numero: ");
        int y = leitor.nextInt();

        if (x > y){
            maior = x;
            menor = y;
        } else if (x < y) {
            maior = y;
            menor = x ;
        }

        while ( menor <= maior){
            System.out.println(menor);
            menor++;
        }



    }
}
