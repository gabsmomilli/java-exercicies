package Estruturas7;

public class ImparEntre5e100 {
    public static void main(String[] args) {
        int i = 0;
        int resto;

        while (i <= 50){
            resto = i % 2;
            if (resto == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
