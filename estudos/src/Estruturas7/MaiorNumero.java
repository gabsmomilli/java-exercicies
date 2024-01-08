package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int i = 0;
        int aux = 0;

        while (i < 5){
            System.out.println("Informe o "+(i+1)+"° numero: ");
            int n = leitor.nextInt();
            numeros.add(n);
            i++;
        }
        for( Integer numero: numeros){
            if(aux == 0 || aux < numero ){
                aux = numero;
            }
        }
        System.out.println("O maior dos cinco numeros é o "+aux);
    }
}
