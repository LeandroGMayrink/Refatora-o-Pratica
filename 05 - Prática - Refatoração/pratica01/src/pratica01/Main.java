package pratica01;

/*----------------------------------------------------
 * Tipo de Triângulo: Equilátero, Isósceles e Escaleno
 * ----------------------------------------------------*/
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis:
        int opcao;
        String resp;
        boolean repetir;
        double lado01 = 0, lado02 = 0, lado03 = 0;

        do {
            // Lendo o primeiro lado:
            repetir = true;
            do {
                resp = JOptionPane.showInputDialog("Informe o primeiro lado:", 0);
                // Verifica se o botão "cancelar" foi pressionado:
                if (resp == null) {
                    System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                    System.exit(0);
                }
                // Verifica se um número válido foi informado:
                try {
                    lado01 = Double.parseDouble(resp);
                    repetir = false;
                } catch (NumberFormatException e) {
                    System.err.println("ERRO: número não identificado.");
                }
            } while (repetir);

            // Lendo o segundo lado:
            repetir = true;
            do {
                resp = JOptionPane.showInputDialog("Informe o segundo lado:", 0);
                // Verifica se o botão "cancelar" foi pressionado:
                if (resp == null) {
                    System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                    System.exit(0);
                }
                // Verifica se um número válido foi informado:
                try {
                    lado02 = Double.parseDouble(resp);
                    repetir = false;
                } catch (NumberFormatException e) {
                    System.err.println("ERRO: número não identificado.");
                }
            } while (repetir);

            // Lendo o terceiro lado:
            repetir = true;
            do {
                resp = JOptionPane.showInputDialog("Informe o terceiro lado:", 0);
                // Verifica se o botão "cancelar" foi pressionado:
                if (resp == null) {
                    System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                    System.exit(0);
                }
                // Verifica se um número válido foi informado:
                try {
                    lado03 = Double.parseDouble(resp);
                    repetir = false;
                } catch (NumberFormatException e) {
                    System.err.println("ERRO: número não identificado.");
                }
            } while (repetir);

            // Cálculo (processamento):
            if (lado01 == lado02 && lado02 == lado03) {
                JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
            } else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03) {
                JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
            } else {
                JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
            }

            /*
             * JOptionPane.showConfirmDialog(parentComponent, message) retorna:
             * 
             * JOptionPane.YES_OPTION, ou JOptionPane.NO_OPTION, ou
             * JOptionPane.CANCEL_OPTION
             * 
             * que são inteiros. Para alterar os botões do seu dialog, crie a versão
             * 
             * sobrecarregada:
             * 
             * showConfirmDialog(parentComponent, message, title, optionType)
             * 
             * em que optionType pode ser:
             * 
             * DEFAULT_OPTION (apesar da documentação não deixar claro, é o OK sozinho)
             * YES_NO_OPTION
             * YES_NO_CANCEL_OPTION
             * OK_CANCEL_OPTION
             */
            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        } while (opcao == JOptionPane.YES_OPTION);
    }
}
