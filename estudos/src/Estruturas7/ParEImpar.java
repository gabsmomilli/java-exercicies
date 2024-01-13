package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        int i = 0;
        int resto;

        while (i < 20) {
            System.out.println("Informe o " + (i + 1) + "° numero: ");
            int n = leitor.nextInt();
            resto = n % 2;
            if( resto == 0 ){
                pares.add(n);
            }
            if ( resto == 1 ){
                impares.add(n);
            }
            i++;
        }

        System.out.println("Lista de numeros pares: "+pares);
        System.out.println("Lista de numeros impares: "+impares);


    }
}
