package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDeNNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        int soma = 0;

        System.out.println("Informe a quantidade de numeros para somar: ");
        int qntdnumeros = leitor.nextInt();

        while (i < qntdnumeros){
            System.out.println("Informe o "+(i+1)+"° numero: ");
            int n = leitor.nextInt();
            soma = soma + n ;
            i++;
        }
        System.out.println("A soma de numeros "+qntdnumeros+ " é de: "+soma);


    }
}
