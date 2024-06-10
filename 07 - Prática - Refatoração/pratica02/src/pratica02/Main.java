package pratica02;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero1 = lerNumero("Informe o primeiro número:");
        int numero2 = lerNumero("Informe o segundo número:");

        String opcaoString = JOptionPane.showInputDialog(null, 
            "Escolha a operação:\n" +
            "1 - Somar\n" +
            "2 - Subtrair\n" +
            "3 - Multiplicar\n" +
            "4 - Dividir"
        );

        int opcao = Integer.parseInt(opcaoString);

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Resultado da soma: " + (numero1 + numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Resultado da subtração: " + (numero1 - numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    JOptionPane.showMessageDialog(null, "Resultado da divisão: " + ((double)numero1 / numero2));
                } else {
                    JOptionPane.showMessageDialog(null, "Impossível dividir por zero!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }

    private static int lerNumero(String mensagem) {
        String input = JOptionPane.showInputDialog(null, mensagem);
        return Integer.parseInt(input);
    }
}
