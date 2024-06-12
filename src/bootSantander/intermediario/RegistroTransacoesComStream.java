package bootSantander.intermediario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);

            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Aqui é atualizado o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final e a lista de transações ao final do processo usando Stream API
        // Crie um fluxo (stream) a partir da lista de transações:
        // Mapeie cada transação para uma string formatada:
        // Colete os elementos do fluxo em uma lista:
        // Para cada elemento da lista, imprime no console:
        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        List<String> formataTransacoes = transacoes.stream()
                .map(transacao -> String.format("%c de %.1f", transacao.getTipo(), transacao.getValor()))
                .toList();
        formataTransacoes.forEach(System.out::println);

        scanner.close();
    }
}

class Transacao {
    private final char tipo;
    private final double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
