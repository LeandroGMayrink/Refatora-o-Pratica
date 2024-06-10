package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Relatorio implements InterfaceRelatorio {

    @Override
    public double calcularTotal(List<Produto> produtos) {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    @Override
    public double aplicarDesconto(double total, boolean clienteVIP) {
        return clienteVIP ? total * 0.90 : total * 0.95;
    }

    @Override
    public double adicionarTaxaEntrega(double total) {
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        return diaSemana == DayOfWeek.SUNDAY ? total + 10.00 : total + 5.00;
    }

    @Override
    public void gerarRelatorio(List<Produto> produtos, boolean clienteVIP) {
        double total = calcularTotal(produtos);
        total = aplicarDesconto(total, clienteVIP);
        total = adicionarTaxaEntrega(total);

        System.out.printf("Total a pagar: R$ %.2f%n", total);
    }
}
