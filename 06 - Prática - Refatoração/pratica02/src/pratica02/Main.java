package pratica02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        cadastrarProdutos(scanner, produtos);

        double totalSemDesconto = calcularTotalSemDesconto(produtos);
        double totalComDesconto = calcularTotalComDesconto(produtos);

        exibirTotais(totalSemDesconto, totalComDesconto);
    }

    private static void cadastrarProdutos(Scanner scanner, ArrayList<Produto> produtos) {
        String opcao;

        do {
            System.out.println("Informe o código do produto:");
            String codigo = scanner.nextLine();

            System.out.println("Informe o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Informe o tipo do produto (roupas, calçados, casa):");
            String tipo = scanner.nextLine();

            System.out.println("Informe o valor do produto:");
            double valor = Double.parseDouble(scanner.nextLine());

            Produto produto = new Produto(codigo, nome, tipo, valor);
            produtos.add(produto);

            System.out.println("Deseja cadastrar outro produto? (s/n)");
            opcao = scanner.nextLine();
        } while (opcao.equalsIgnoreCase("s"));
    }

    private static double calcularTotalSemDesconto(ArrayList<Produto> produtos) {
        double totalSemDesconto = 0;
        for (Produto produto : produtos) {
            totalSemDesconto += produto.valor;
        }
        return totalSemDesconto;
    }

    private static double calcularTotalComDesconto(ArrayList<Produto> produtos) {
        double totalComDesconto = 0;
        for (Produto produto : produtos) {
            totalComDesconto += produto.getValorComDesconto();
        }
        return totalComDesconto;
    }

    private static void exibirTotais(double totalSemDesconto, double totalComDesconto) {
        System.out.println("Total de produtos vendidos sem aplicação dos descontos: " + totalSemDesconto);
        System.out.println("Total de produtos vendidos com aplicação dos descontos: " + totalComDesconto);
    }
}

/*
 * 
 * Separação das Classes:
 * 
 * Agora as classes Produto e Main estão em arquivos separados, o que ajuda 
 * na organização do código.
 * 
 * Utilização de Construtores Melhorados:
 * 
 * O construtor da classe Produto foi melhorado, utilizando this() para reutilizar 
 * código e simplificar a inicialização dos atributos.
 * 
 * Uso de Métodos para Entrada de Dados:
 * 
 * Criamos o método cadastrarProdutos na classe Main para lidar 
 * com a entrada de dados, tornando o método main mais limpo e legível.
 * 
 * Uso de Métodos para Cálculo dos Totais:
 * 
 * Criamos os métodos calcularTotalSemDesconto e calcularTotalComDesconto 
 * na classe Main para calcular os totais de produtos vendidos 
 * com e sem desconto, melhorando a legibilidade e facilitando a manutenção do código.
 * 
 */