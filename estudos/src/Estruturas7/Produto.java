package Estruturas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> produtos= new ArrayList<>();
        int i = 0;
        double aux = 0;

        while (i < 3){
            System.out.println("Informe o  valor do "+(i+1)+"° produto: ");
            double p = leitor.nextInt();
            produtos.add(p);

            if (i == 0 || p < aux){
                aux = p;
            }

            i++;
        }

        System.out.println("O produto mais barato tem como valor: "+aux);
    }
}
