package OrientacaoAObjetos.ModelagemDeclasse3;

import Desafio8.Candidato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaConcessionaria {
    ArrayList<Carro> carros = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    private void exibirMenu() {
        System.out.println("Informe o numero da opcao desejada: ");
        System.out.println("1- Adicionar carro.");
        System.out.println("2- Exibir lista de carros.");
        System.out.println("3- Deletar carro.");
        System.out.println("4- Pintar carro.");
        System.out.println("5- Comprar carro.");
        System.out.println("6- Encerrar programa.");
    }

    public void exibirCarros(ArrayList<Carro> carros){
        if(carros.isEmpty()){
            System.out.println("Nao ha nenhum carro cadastrado.");
        }else{
            System.out.println("Lista de candidatos: ");
            for(Carro carro : carros){
                System.out.println("- NOME: " + carro.getNome() +
                        "- FABRICANTE: " + carro.getFabricante() +
                        "- PESO: " + carro.getPeso()
                //terminar);
            }
        }
    }

    public void adicionarCarro () {
        System.out.println("Informe o nome do carro: ");
        String nome = leitor.next();

        System.out.println("Informe o peso do carro: ");
        Double peso = leitor.nextDouble();

        System.out.println("Informe o nome do fabricante do carro: ");
        String fabricante = leitor.next();

        System.out.println("Informe a cor do carro: ");
        String cor = leitor.next();

        System.out.println("Informe o valor do carro: ");
        Double valor = leitor.nextDouble();

        System.out.println("Informe a placa do carro: ");
        String placa = leitor.next();

        if (buscarCarroPelaPlaca(placa) == null){
            Carro novoCarro = new Carro(nome, peso, fabricante, cor, valor, placa);
            carros.add(novoCarro);
            System.out.println("Um novo carro foi adicionado.");
        } else {
            System.out.println("Este carro ja existe na base.");
        }

    }

    public void darDesconto(Carro carro) {
        if (carro.getValor() >= 100000 && carro.getCor().equals("vermelho")) {
            double desconto = carro.getValor() * 0.2;
            double novoPreco = carro.getValor() - desconto;
            System.out.println("- valor cheio: " + carro.getValor() +
                    "\n- valor do desconto: " + desconto +
                    "\n- valor final: " + novoPreco);
            carro.setValor(novoPreco);
        } else {
            System.out.println("Desconto não aplicado.");
        }
    }
    public void pintar(Scanner leitor) {
        System.out.println("Informe a placa ndo carro cuja cor deseja trocar: ");
        String placa = leitor.next();
        Carro carro = buscarCarroPelaPlaca(placa);
        if (carro != null){
            System.out.println("Cor antiga de seu carro: " + carro.getCor());
            System.out.println("Informe a cor no qual deseja mudar seu carro: ");
            String corNova = leitor.next();
            carro.setCor(corNova);
        } else {
            System.out.println("Carro nao encontrado.");
        }
    }

    public Carro buscarCarroPelaPlaca(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)){
                return carro;
            }
        }
        return null;
    }
}
