package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int i = 0;
        int aux = 0;

        while (i < 10) {
            System.out.println("Informe o " + (i + 1) + "° numero: ");
            int n = leitor.nextInt();
            numeros.add(n);
            if (i == 0 || aux > n){
                aux = n;
            }
            i++;
        }

        for (int a = numeros.size() - 1; a >= 0; a--){
            System.out.println(numeros.get(a));

        }
    }
}
