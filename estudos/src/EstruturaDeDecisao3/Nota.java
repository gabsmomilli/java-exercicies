package EstruturaDeDecisao3;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float media;

        System.out.println("informe a nota do primeiro semestre do aluno:" );
        float n1 = leitor.nextFloat();
        System.out.println("informe a nota do segundo semestre do aluno:" );
        float n2 = leitor.nextFloat();

        media = (n1+n2)/2;

        if (media < 6){
            System.out.println("Reprovado");
        }else if (media >= 6 & media < 10){
            System.out.println("Aprovado");
        }else if (media ==10){
            System.out.println("Aprovado com distincao");
        }

    }
}
