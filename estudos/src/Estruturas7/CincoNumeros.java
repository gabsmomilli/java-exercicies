package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CincoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int i = 0;

        while (i < 5) {
            System.out.println("Informe o " + (i + 1) + "° numero: ");
            int n = leitor.nextInt();
            numeros.add(n);
            i++;
        }

        for ( Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
