package EstruturaDeRepeticao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaCinco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Informe o "+(i + 1)+ "º número: ");
            int numero = leitor.nextInt();
            soma= soma + numero;
        }
        System.out.println("A soma dos 5 numeros é: "+soma);
    }
}
