package EstruturaDeDecisao3;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe o valor de x: ");
        int x = leitor.nextInt();
        System.out.println("informe o valor de y: ");
        int y = leitor.nextInt();

        if (x > y){
            System.out.println(x + " é maior que "+ y);
        } else if (x < y){
            System.out.println(x + " é menor que "+ y);
        } else if (x ==y){
            System.out.println("os numeros sao iguais");
        }
    }
}
