package bootSantander.basico;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declarando e Lendo Variáveis
        double saldoAtual = scan.nextDouble();      // 1000 | 100 | 4000
        double valorDeposito = scan.nextDouble();   // 500 | 10 | 1500
        double valorRetirada = scan.nextDouble();   // 200 | 50 | 200

        // Calcular o saldo atualizado de acordo com a descrição deste desafio
        saldoAtual += valorDeposito;
        saldoAtual -= valorRetirada;

        // Imprimir a saída conforme a tabela de exemplos (uma casa decimal)
        // 1300.0 | 60.0 | 5300.0
        System.out.printf("Saldo atualizado na conta: %.1f", saldoAtual);

    }
}
