package EstruturaDeRepeticao6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Informe a quantidade de numeros: ");
        int qntdNumeros = leitor.nextInt();

        while (contador < qntdNumeros){
            System.out.println("Informe o "+ (contador+1)+"º número: ");
            int n = leitor.nextInt();
            numeros.add(n);
            contador ++;
        }

        for (Integer numero : numeros ){
            int resto = numero % 2;
            if(resto == 1){
                System.out.println(numero);
            }
        }
    }
}
