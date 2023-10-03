package bootSantander.basico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("##0.00");

        double valorInicial = scan.nextDouble();
        double taxaJuros = scan.nextDouble();
        int periodo = scan.nextInt();
        double valorFinal;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
//        double valorFinal = valorInicial * Math.pow(1+taxaJuros,periodo);   // modelo compacto (formula financeira)
        for(int i=1; i<=periodo; i++) {
            valorInicial = valorInicial * (1 + taxaJuros);
        }

        valorFinal = valorInicial;

//        System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scan.close();
    }
}
