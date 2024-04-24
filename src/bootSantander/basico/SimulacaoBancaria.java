package bootSantander.basico;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 0;
        boolean login = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair

        while (login) {
            System.out.print("Digite: \n1-Deposito   2-saque\n3-saldo atual   0-sair\n>>");
            int opcao = scan.nextInt();
            // Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            System.out.println();
            switch (opcao) {
                case 1:
                    // Solicita valor a ser depositado
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scan.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo Atual R$" + saldo);
                    break;
                case 2:
                    // Solicita valor a ser sacado
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = scan.nextDouble();
                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.println("Saldo Atual R$" + saldo);
                        break;
                    } else {
                        System.out.println("Saldo Insuficiente!");
                        break;
                    }
                case 3:
                    // Exibe o saldo atual da conta
                    System.out.println("Saldo Atual R$" + saldo);
                    break;
                case 0:
                    // O programa encerra
                    System.out.println("Encerrando programa . . .");
                    login = false;
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
        System.out.println("Programa encerrado!");
        scan.close();
    }
}
