package bootSantander.intermediario;

import java.util.Scanner;

public class UltimaTransacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        String[] partes = entrada.split(",");

        // TODO: Solicitar ao usuário que forneca os valores necessários para criar uma Transacao.
        Transacao1 transacao = new Transacao1(partes[0], partes[1], partes[2], Double.valueOf(partes[3]).doubleValue());
        transacao.imprimir();
    }
}

class Transacao1 {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao1(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}
