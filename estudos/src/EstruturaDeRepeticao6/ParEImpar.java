package EstruturaDeRepeticao6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        int resto;
        List<Integer> numeros = new ArrayList<>();


        System.out.println("Informe a quantidade de numeros: ");
        int qntdNumeros = leitor.nextInt();

        while (contador < qntdNumeros){
            System.out.println("Informe o "+(contador+1)+"º número: ");
            int n = leitor.nextInt();
            numeros.add(n);
            contador++;
        }
        System.out.println("---------------------------");
        System.out.println("Numeros impares");
        for(Integer numero : numeros){
            resto = numero % 2;
            if (resto == 1){
                System.out.println(numero);
            }
        }
        System.out.println("---------------------------");
        System.out.println("Numeros pares");
        for(Integer numero : numeros){
            resto = numero % 2;
            if (resto == 0){
                System.out.println(numero);
            }
        }
    }
}
