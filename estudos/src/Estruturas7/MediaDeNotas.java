package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        int i = 0;
        double notas = 0;
        double media;

        while (i < 4) {
            System.out.println("Informe o " + (i + 1) + "° nota: ");
            Double n = leitor.nextDouble();
            numeros.add(n);
            i++;
        }

        for (Double numero : numeros){
            notas = notas + numero;
        }
        media = notas /4;
        System.out.println("a media das 4 notas é de: "+ media);
    }
}
