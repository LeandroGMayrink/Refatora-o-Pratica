import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Informe o valor do coeficiente a:");
            double a = scanner.nextDouble();
            System.out.println("Informe o valor do coeficiente b:");
            double b = scanner.nextDouble();
            System.out.println("Informe o valor do coeficiente c:");
            double c = scanner.nextDouble();

            if (a == 0 && b == 0 && c == 0) {
                System.out.println("Igualdade confirmada: 0 = 0");
            } else if (a == 0 && b == 0) {
                System.out.println("Coeficientes informados incorretamente");
            } else if (a == 0) {
                double x = -c / b;
                System.out.println("Esta é uma equação de primeiro grau: x = " + x);
            } else {
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
                    System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = "
                            + x1 + ", x'' = " + x2);
                }
            }

            System.out.println("Deseja resolver outra equação? (s/n)");
            repetir = scanner.next().charAt(0);
        } while (repetir == 's' || repetir == 'S');

        scanner.close();
    }
}
