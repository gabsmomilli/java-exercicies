package Estruturas7;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> nomes = Arrays.asList("Domingo","Segunda", "Terca",
                "Quarta", "Quinta", "Sexta", "Sabado");

        System.out.println("Informe um numero de 1 a 7: ");
        int numero = leitor.nextInt();

        if(numero < 1 | numero > 7){
            System.out.println("Numero invalido");
        }else if (numero >= 1 & numero <= 7 ){
            numero = numero - 1;
            System.out.println(nomes.get(numero));
        }
    }
}
