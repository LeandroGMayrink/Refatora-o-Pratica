package pratica01;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        double[] vetor1 = {90, 88, 78, 76};
        double[] vetor2 = {865, 564, 43, 12};

        double mediaVetor1 = calcularMedia(vetor1);
        System.out.println("Média do vetor 1: " + mediaVetor1);

        double mediaVetor2 = calcularMedia(vetor2);
        System.out.println("Média do vetor 2: " + mediaVetor2);
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double elemento : vetor) {
            soma += elemento;
        }
        return soma / vetor.length;
    }
}



/*
 * Métodos para Calcular a Média:
 * Antes, o cálculo da média dos valores estava repetido duas vezes no código, 
 * uma vez para cada vetor. Agora, criamos um método chamado calcularMedia que recebe 
 * um vetor como entrada e calcula a média dos valores desse vetor. Isso evita a repetição
 * de código e torna o programa mais fácil de entender e modificar.
 * 
 * Variáveis Descritivas:
 * Renomeamos as variáveis vet1, vet2, soma e media para nomes mais descritivos,
 * como vetor1, vetor2, somaVetor e mediaVetor. Isso torna mais claro o propósito 
 * dessas variáveis.
 * 
 * Loop Único para Calcular Média:
 * Antes, o cálculo da média de cada vetor era feito em um loop separado.
 * Agora, usamos um único loop para calcular a média de cada vetor, o que simplifica
 * o código e o torna mais eficiente.
 */
