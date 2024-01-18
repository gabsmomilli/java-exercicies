package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaEMultiplicacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int i = 0;
        int soma = 0;
        int mult = 1;

        while (i < 5) {
            System.out.println("Informe o " + (i + 1) + "° numero: ");
            int n = leitor.nextInt();
            numeros.add(n);
            i++;
        }

        for (int a = 0; a < numeros.size(); a++) {
            soma = soma + numeros.get(a);
            mult = mult * numeros.get(a);
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicacao: " + mult);
    }
}
