package EstruturaDeDecisao3;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Indorme o valor do primeiro produto:");
        double p1 = leitor.nextDouble();
        System.out.println("Indorme o valor do segundo produto:");
        double p2 = leitor.nextDouble();
        System.out.println("Indorme o valor do terciero produto:");
        double p3 = leitor.nextDouble();

        if (p1 < p2 & p1 < p3){
            System.out.println("compre o primeiro produto, pois ele é mais barato");
        }else if (p2 < p1 & p2 < p3){
            System.out.println("compre o segundo produto pois ele é mais barato");
        }else if (p3 < p1 & p3 < p2){
            System.out.println("compre o terceiro produto pois ele é mais barato");
        }
    }
}
