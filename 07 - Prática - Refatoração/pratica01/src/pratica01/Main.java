package pratica01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = lerNome("Informe o primeiro nome:");
        String nomeMeio = lerNome("Informe o nome do meio:");
        String ultimoNome = lerNome("Informe o último nome:");

        String nomeCompleto = construirNomeCompleto(primeiroNome, nomeMeio, ultimoNome);

        JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto);
    }

    private static String lerNome(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    private static String construirNomeCompleto(String primeiroNome, String nomeMeio, String ultimoNome) {
        return primeiroNome + " " + nomeMeio + " " + ultimoNome;
    }
}