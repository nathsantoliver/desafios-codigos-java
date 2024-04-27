package bootSantander.basico;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialize um bloco try-catch para capturar exceções:
        try {
            // Leia a entrada do usuário como uma string representando o número da conta:
            System.out.print("Digite o número da conta: ");
            String contaBancaria = scanner.nextLine();

            // Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(contaBancaria);

        } catch (IllegalArgumentException e) {
            // Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
            // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
            // Verifique se o número da conta tem exatamente 8 dígitos:
            if (numeroConta.length() == 8) {
                System.out.println("Numero de conta valido.");
            } else {
                throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
            }
    }
}