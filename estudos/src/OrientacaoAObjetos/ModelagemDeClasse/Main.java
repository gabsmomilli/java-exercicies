package OrientacaoAObjetos.ModelagemDeClasse;

public class Main {
    public static void main(String[] args) {

        // BOLA
        Bola bola1 = new Bola(3.14, "branca", "barbie",30.0);
        Bola bola2 = new Bola(19.6,"adidas", "azul", 27.9);
        Bola bola3 = new Bola(15.7, "verde", "nike", 0.1);

        bola1.exibirInformacoes();
        bola2.exibirInformacoes();
        bola3.exibirInformacoes();

        // PESSOA
        Pessoa pessoa1 = new Pessoa("Gabriela", 22 , 59.0, 1.63);
        Pessoa pessoa2 = new Pessoa("Ramon", 22, 90.0, 1.68);
        Pessoa pessoa3 = new Pessoa("Carla", 37, 65.0, 1.71);

        pessoa1.exibirInformacoes();
        pessoa1.calcularIMC();

        pessoa2.exibirInformacoes();
        pessoa2.calcularIMC();

        pessoa3.exibirInformacoes();
        pessoa3.calcularIMC();

        // CONTA CORRENTE
        ContaCorrente conta1 = new ContaCorrente(1234, "Gabriela", 0.10);
        ContaCorrente conta2 = new ContaCorrente(12345, "Ramon",10000.00);
        ContaCorrente conta3 = new ContaCorrente(123456, "Carla", 15000.00);

        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
        conta3.exibirInformacoes();

    }
}
