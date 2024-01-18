package OrientacaoAObjetos.ModelagemDeclasse3;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaConcessionaria {
    private ArrayList<Carro> carros;
    private Scanner leitor;

    public SistemaConcessionaria() {
        carros = new ArrayList<>();
        leitor = new Scanner(System.in);
    }

    public void iniciarSistemaComcessionaria(){
        int opcao = -1;

        while(opcao != 6){
            exibirMenu();

            opcao = leitor.nextInt();;
            leitor.nextLine();
            switch (opcao){
                case 1:
                    adicionarCarro(carros, leitor);
                    break;
                case 2:
                    exibirCarros(carros);
                    break;
                case 3:
                    deletarCarro(carros, leitor);
                    break;
                case 4:
                    pintar(carros, leitor);
                    break;
                case 5:
                    darDesconto(carros, leitor);
                    break;
                case 6:
                    System.out.println("Encerrar programa.");
                    break;
                default:
                    System.out.println("opcao invalida.");
            }
        }
    }

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
            System.out.println("Lista de carros: ");
            for(Carro carro : carros){
                System.out.println("- NOME: " + carro.getNome() + "\n" +
                        "- FABRICANTE: " + carro.getFabricante() + "\n" +
                        "- PESO: " + carro.getPeso() + "\n" +
                        "- FABRICANTE: " + carro.getFabricante() + "\n" +
                        "- COR: " + carro.getCor() + "\n" +
                        "- VALOR: " + carro.getPlaca() + "\n" +
                        "- PLACA: " + carro.getPlaca());
            }
        }
    }

    public void adicionarCarro(ArrayList<Carro> carros, Scanner leitor) {
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

        if (buscarCarroPelaPlaca(carros, placa) == null){
            Carro novoCarro = new Carro(nome, peso, fabricante, cor, valor, placa);
            carros.add(novoCarro);
            System.out.println("Um novo carro foi adicionado.");
        } else {
            System.out.println("Este carro ja existe na base.");
        }

    }

    public void darDesconto(ArrayList<Carro> carros, Scanner leitor) {
        System.out.println("Informe a placa do carro que deseja comprar: ");
        String placa = leitor.next();

        Carro carroAComprar = buscarCarroPelaPlaca(carros, placa);
        if (carroAComprar != null) {
            if (carroAComprar.getValor() >= 100000 && carroAComprar.getCor().equals("vermelho")) {
                double desconto = carroAComprar.getValor() * 0.2;
                double novoPreco = carroAComprar.getValor() - desconto;
                System.out.println("- valor cheio: " + carroAComprar.getValor() +
                        "\n- valor do desconto: " + desconto +
                        "\n- valor final: " + novoPreco);
                carroAComprar.setValor(novoPreco);
            } else {
                System.out.println("Valor do carro: " + carroAComprar.getValor());
            }
        } else {
            System.out.println("Placa nao encontrada.");
        }

    }
    public void pintar(ArrayList<Carro> carros, Scanner leitor) {
        System.out.println("Informe a placa ndo carro cuja cor deseja trocar: ");
        String placa = leitor.next();
        Carro carro = buscarCarroPelaPlaca(carros, placa);

        if (carro != null){
            System.out.println("Cor antiga de seu carro: " + carro.getCor());
            System.out.println("Informe a cor no qual deseja mudar seu carro: ");
            String corNova = leitor.next();
            carro.setCor(corNova);
        } else {
            System.out.println("Carro nao encontrado.");
        }
    }

    public Carro buscarCarroPelaPlaca(ArrayList<Carro> carros, String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)){
                return carro;
            }
        }
        return null;
    }

    public void deletarCarro(ArrayList<Carro> carros, Scanner leitor) {
        System.out.println("Informe a placa do carro que deseja deletar: ");
        String placa = leitor.next();

        Carro carroParaDeletar = buscarCarroPelaPlaca(carros, placa);

        if(carroParaDeletar != null){
            carros.remove(carroParaDeletar);
            System.out.println("Carro deletado com sucesso!");
        }else{
            System.out.println("Placa nao encontrada.");
        }
    }
}