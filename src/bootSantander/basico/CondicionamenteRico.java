package bootSantander.basico;

import java.util.Scanner;

public class CondicionamenteRico {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scan = new Scanner(System.in);
        int valorTotal = scan.nextInt();
        int valorSaque = scan.nextInt();

        // Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        if(valorTotal >= valorSaque) {
            valorTotal -= valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + valorTotal);
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado!");
        }

        scan.close();

    }
}
