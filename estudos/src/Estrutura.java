import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estrutura {
    public static void main(String[] args) {
        int idade = 23;
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else if (idade == 17) {
            System.out.println("Você é menor de idade");
        } else if (idade <= 16) {
            System.out.println("Você é praticamente um bebê");
        }

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        // Iniciar a variável, condição, resultado
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        ///lista de strings
        String[] nomes = {"Ramon","Gabi","Maria","Cida"};
        ///percorre a lista 'nomes' e chama de nome cada um espaco da lista
        ///for each
        for (String nome:nomes){
            System.out.println(nome.toUpperCase());
        }

        ///iniciar uma lista
        List<String> alunos = new ArrayList<>();
        ///adc
        alunos.add("Carla");
        ///get
        alunos.get(0);

        ///map eh usada com chave e valor
        Map<String, Integer> nomeEIdade = new HashMap<>();
        ///no caso a chave é o nome e o valor é a idade
        ///a chave nao pode se repetir
        ///caso seja usado um put p adc uma chave q ja existe o VALOR da chave sera ALTERADO
        nomeEIdade.put("Gabriela", 23);
        ///get
        System.out.println(nomeEIdade.get("Gabriela")+ "aqui");

    }
}
