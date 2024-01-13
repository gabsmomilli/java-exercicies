package EstruturaDeRepeticao5;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        System.out.println("Informe a quantidade de numeros: ");
        int qntdNumeros = leitor.nextInt();

        while (contador < qntdNumeros){
            System.out.println("Informe o "+(contador+1)+"º número:");
            int numero = leitor.nextInt();
            soma = soma + numero;
            contador++;
        }
        int media = soma /qntdNumeros;
        System.out.println("A media dos "+qntdNumeros+" numeros é de "+media);
    }
}
