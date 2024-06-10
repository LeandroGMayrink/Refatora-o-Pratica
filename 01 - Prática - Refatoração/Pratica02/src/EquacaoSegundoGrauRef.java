import java.util.Scanner;

public class EquacaoSegundoGrauRef {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            double a = lerCoeficiente(scanner, "a");
            double b = lerCoeficiente(scanner, "b");
            double c = lerCoeficiente(scanner, "c");

            resolverEquacao(a, b, c);

            System.out.println("Deseja resolver outra equação? (s/n)");
            repetir = scanner.next().charAt(0);
        } while (repetir == 's' || repetir == 'S');

        scanner.close();
    }

    private static double lerCoeficiente(Scanner scanner, String coeficiente) {
        System.out.println("Informe o valor do coeficiente " + coeficiente + ":");
        return scanner.nextDouble();
    }

    private static void resolverEquacao(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            resolverEquacaoPrimeiroGrau(b, c);
        } else {
            resolverEquacaoSegundoGrau(a, b, c);
        }
    }

    private static void resolverEquacaoPrimeiroGrau(double b, double c) {
        double x = -c / b;
        System.out.println("Esta é uma equação de primeiro grau: x = " + x);
    }

    private static void resolverEquacaoSegundoGrau(double a, double b, double c) {
        System.out.println("Esta é uma equação de segundo grau");
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1
                    + ", x'' = " + x2);
        }
    }
}

/*
 * Método para Ler Coeficientes:
 * Refatoração: Criamos um método chamado lerCoeficiente para evitar repetir o
 * código de leitura dos coeficientes.
 * Razão: Isso deixa o código mais organizado e fácil de entender, pois
 * centraliza a lógica de leitura em um único lugar.
 * 
 * Método para Resolver a Equação:
 * Refatoração: Criamos o método resolverEquacao para separar a lógica de
 * resolução da equação do restante do código.
 * Razão: Isso deixa o main mais limpo e claro, facilitando a compreensão do
 * fluxo do programa.
 * 
 * Métodos para Resolver Equações de Primeiro e Segundo Grau:
 * Refatoração: Criamos métodos separados para resolver equações de primeiro e
 * segundo grau.
 * Razão: Isso melhora a organização do código e facilita a manutenção, pois
 * isola a lógica de resolução em métodos específicos.
 */