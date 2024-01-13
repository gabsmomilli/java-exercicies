package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenorDeDez {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int i = 0;
        int menor = 0 ;
        int maior = 0;

        while (i <10){
            System.out.println("Informe o "+(i+1)+"° numero: ");
            int n = leitor.nextInt();
            numeros.add(n);
            if (i == 0 || menor > n){
                menor = n;
            }else if (maior < n){
                maior = n;
            }
            i++;
        }

        System.out.println("Menor numero: "+menor+
        "\nMaior numero: "+maior);
    }
}
