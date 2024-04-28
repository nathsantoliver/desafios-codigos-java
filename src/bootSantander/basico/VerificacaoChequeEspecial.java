package bootSantander.basico;

import java.util.Scanner;

/**
 * E: 1000
 * E: 100
 * S: Transação realizada com sucesso.
 * ------------------------------------------------------------------
 * E: 2500
 * E: 2750
 * S: Transação realizada com sucesso utilizando o cheque especial.
 * ------------------------------------------------------------------
 * E: 300
 * E: 1500
 * S: Transação não realizada. Limite do cheque especial excedido.
 */

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;
        double saldoTotal = saldo + limiteChequeEspecial;

        // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
        if (saque > saldo && saque > saldoTotal) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

            // Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        } else if (saque > saldo && saque < saldoTotal) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");

            // Verifique se o saque não ultrapassa o saldo disponível na conta:
        } else {
            System.out.println("Transação realizada com sucesso.");
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
