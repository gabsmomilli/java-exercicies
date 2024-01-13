package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int i = 0;
        int media;
        int num = 0;

        System.out.println("Informe quantos numero deseja fazer a media: ");
        int qntdNumeros = leitor.nextInt();

        while (i < qntdNumeros){
            System.out.println("Informe o "+(i+1)+"° numero: ");
            int n = leitor.nextInt();
            numeros.add(n);
            i++;
        }
        for (int a = 0; a < numeros.size(); a++){
            num = num + numeros.get(a);
        }
        media = num /qntdNumeros;
        System.out.println(media);
    }
}
