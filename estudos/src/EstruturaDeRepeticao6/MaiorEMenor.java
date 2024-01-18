package EstruturaDeRepeticao6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        int menorNumero = 0;
        int maiorNumero = 0;
        int soma;
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Informe a quantidade de numeros: ");
        int qntdNumero = leitor.nextInt();

        while(contador < qntdNumero){
            System.out.println("Informe o "+(contador+1)+"º número: " );
            int n = leitor.nextInt();
            numeros.add(n);

            if (contador == 0 || n < menorNumero){
                menorNumero = n;
            }

            contador++;
        }

        for (Integer numero : numeros){
            if (maiorNumero < numero){
                maiorNumero = numero;
            }
        }

        soma = maiorNumero + menorNumero;
        System.out.println("maior numero: "+ maiorNumero + "\nmenor numero: "+
                menorNumero+"\nsoma: "+ soma);
    }
}
