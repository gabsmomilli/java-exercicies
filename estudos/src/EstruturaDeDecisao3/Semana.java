package EstruturaDeDecisao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> diasDaSemana = Arrays.asList("Domingo", "Segunda",
                "Terca", "Quarta","Quinta","Sexta","Sabado");

        System.out.println("infrome um numero de 1 a 7: ");
        int numero = leitor.nextInt();

        if (numero >= 1 & numero <=7){
            numero = numero -1;
            System.out.println(diasDaSemana.get(numero));
        }else if ( numero < 1 & numero > 7){
            System.out.println("Valor invalido");
        }
    }
}
