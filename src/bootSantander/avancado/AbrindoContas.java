package bootSantander.avancado;

import java.util.Scanner;

public class AbrindoContas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroConta = scan.nextInt();
        scan.nextLine();
        String nomeTitular = scan.nextLine();
        double saldo = scan.nextDouble();

        // Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        System.out.println("Informacoes:");

        // Imprimir as informações da conta usando o objeto criado no TODO acima
        System.out.println("Conta: " + conta.numero);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: R$ " + conta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
