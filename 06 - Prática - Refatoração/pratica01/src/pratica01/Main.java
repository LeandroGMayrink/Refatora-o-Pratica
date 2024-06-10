package pratica01;

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String codigo;
    String nome;
    String tipo;
    double valor;
    double desconto;

    Produto(String codigo, String nome, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.desconto = calcularDesconto(tipo);
    }

    double calcularDesconto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "roupas":
                return 0.05;
            case "calçados":
                return 0.04;
            case "casa":
                return 0.03;
            default:
                return 0;
        }
    }

    double valorComDesconto() {
        return valor - (valor * desconto);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
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

        double totalSemDesconto = 0;
        double totalComDesconto = 0;

        for (Produto produto : produtos) {
            totalSemDesconto += produto.valor;
            totalComDesconto += produto.valorComDesconto();
        }

        System.out.println("Total de produtos vendidos sem aplicação dos descontos: " + totalSemDesconto);
        System.out.println("Total de produtos vendidos com aplicação dos descontos: " + totalComDesconto);
    }
}