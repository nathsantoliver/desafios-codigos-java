package bootSantander.intermediario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String titular = scan.next();
        int numeroConta = scan.nextInt();
        double saldo = scan.nextDouble();
        double taxaJuros = scan.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria2 {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria2(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + df.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria2 {
    private double taxaJuros;
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        // TODO: Implementar adequadamente esta sobrecarga de construtores.
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        // TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
