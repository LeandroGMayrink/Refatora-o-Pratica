package pratica02;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        while (true) {
            double lado01 = lerLado("Informe o primeiro lado:");
            double lado02 = lerLado("Informe o segundo lado:");
            double lado03 = lerLado("Informe o terceiro lado:");

            String tipoTriangulo = determinarTipoTriangulo(lado01, lado02, lado03);
            JOptionPane.showMessageDialog(null, "Triângulo " + tipoTriangulo);

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    private static double lerLado(String mensagem) {
        double lado = 0;
        boolean repetir;
        do {
            String resp = JOptionPane.showInputDialog(mensagem, 0);
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                System.exit(0);
            }
            try {
                lado = Double.parseDouble(resp);
                repetir = false;
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        return lado;
    }

    private static String determinarTipoTriangulo(double lado01, double lado02, double lado03) {
        if (lado01 == lado02 && lado02 == lado03) {
            return "equilátero";
        } else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}

/*
 * Separação da Leitura de Lados em um Método:
 * 
 * Justificativa: Reduz a duplicação de código e melhora a legibilidade. 
 * Reutilizar o mesmo método para ler cada lado torna o main mais 
 * limpo e facilita a manutenção.
 * 
 * Separação da Determinação do Tipo de Triângulo em um Método:
 * 
 * Justificativa: Isola a lógica de negócio, tornando o código mais modular. 
 * Isso facilita testes e futuras modificações na lógica de determinação do 
 * tipo de triângulo.
 * 
 * Uso de um Loop Simples para Continuar ou Sair:
 * 
 * Justificativa: Simplifica o controle de fluxo do programa. 
 * Um loop while (true) com uma condição de saída clara (break) 
 * torna o fluxo mais direto e fácil de entender.
 * 
 */
