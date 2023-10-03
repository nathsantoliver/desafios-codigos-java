package bootSantander.basico;

import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valor = scan.nextDouble();

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.println("Deposito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f", valor);
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
            //TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }

    }
}
