package bootSantander.basico;

import java.util.Scanner;

/**
 * E: 1500
 * E: 430
 * S: Saque realizado. Limite restante:
 * S: 1070.0
 * E: 0
 * S: Transacoes encerradas.
 * +-------+--------------------------------------+
 * E: 500
 * E: 1500
 * S: Limite diario de saque atingido.
 * S: Transacoes encerradas.
 * +-------+--------------------------------------+
 * E: 80
 * E: 40
 * S: Saque realizado. Limite restante:
 * S: 40.0
 * E: 0
 * S: Transacoes encerradas.
 */

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double valorSaque = 0d;

        // Crie um loop 'for' para iterar sobre os saques:
        for (double i = limiteDiario; i > 0; i -= valorSaque ) {
            // Solicite ao usuário o valor do saque:
            valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;

            // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            } else if (valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque;

                // Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque realizado. Limite restante:");
                System.out.println(limiteDiario);

            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido.");
                break;
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
