package pratica01;
import javax.swing.JOptionPane;

public class teste {
    // Constantes para mensagens
    private static final String MENSAGEM_NOTA = "Informe a nota [0, 10]";
    private static final String MENSAGEM_SALARIO = "Informe o salário";
    private static final String MENSAGEM_SEXO = "Informe o sexo (m ou f)";
    private static final String MENSAGEM_IDADE = "Informe a idade";

    public static void main(String[] args) {
        // Variáveis para armazenar os dados do aluno
        double nota = lerNota();
        double salario = lerSalario();
        String sexo = lerSexo();
        int idade = lerIdade();

        // Exibir informações do aluno
        JOptionPane.showMessageDialog(null, "Nota informada: " + nota);
        JOptionPane.showMessageDialog(null, "Salário informado: " + salario);
        JOptionPane.showMessageDialog(null, "Sexo informado: " + sexo);
        JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
    }

    // Método para ler e validar a nota do aluno
    private static double lerNota() {
        double nota;
        do {
            String resposta = JOptionPane.showInputDialog(MENSAGEM_NOTA);
            if (resposta == null) {
                exibirMensagemErro();
                continue;
            }
            try {
                nota = Double.parseDouble(resposta);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    exibirMensagemErro();
                }
            } catch (NumberFormatException e) {
                exibirMensagemErro();
            }
        } while (true);
    }

    // Método para ler e validar o salário do aluno
    private static double lerSalario() {
        double salario;
        do {
            String resposta = JOptionPane.showInputDialog(MENSAGEM_SALARIO);
            if (resposta == null) {
                exibirMensagemErro();
                continue;
            }
            try {
                salario = Double.parseDouble(resposta);
                if (salario > 0) {
                    return salario;
                } else {
                    exibirMensagemErro();
                }
            } catch (NumberFormatException e) {
                exibirMensagemErro();
            }
        } while (true);
    }

    // Método para ler e validar o sexo do aluno
    private static String lerSexo() {
        String sexo;
        do {
            sexo = JOptionPane.showInputDialog(MENSAGEM_SEXO);
            if (sexo == null) {
                exibirMensagemErro();
                continue;
            }
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                return sexo;
            } else {
                exibirMensagemErro();
            }
        } while (true);
    }

    // Método para ler e validar a idade do aluno
    private static int lerIdade() {
        int idade;
        do {
            String resposta = JOptionPane.showInputDialog(MENSAGEM_IDADE);
            if (resposta == null) {
                exibirMensagemErro();
                continue;
            }
            try {
                idade = Integer.parseInt(resposta);
                if (idade >= 6 && idade <= 150) {
                    return idade;
                } else {
                    exibirMensagemErro();
                }
            } catch (NumberFormatException e) {
                exibirMensagemErro();
            }
        } while (true);
    }

    // Método para exibir mensagem de erro
    private static void exibirMensagemErro() {
        System.err.println("ERRO: Entrada inválida!");
    }
}


/*
 * Métodos Separados:
 * Dividimos o código em métodos separados para lidar com a leitura e validação 
 * de cada tipo de dado (nota, salário, sexo e idade). Isso deixa o código mais
 * organizado e fácil de entender, pois cada método tem uma responsabilidade clara.
 * 
 * Uso de Constantes:
 * Criamos constantes para as mensagens exibidas ao usuário,
 * como "Informe a nota [0, 10]". Isso facilita a modificação das mensagens 
 * no futuro, pois elas estão centralizadas em um único lugar.
 * 
 * Melhor Nomenclatura de Variáveis:
 * Renomeamos algumas variáveis para nomes mais descritivos, como "resposta" 
 * para a entrada do usuário. Isso torna o propósito das variáveis 
 * mais claro e facilita a compreensão do código.
 */
