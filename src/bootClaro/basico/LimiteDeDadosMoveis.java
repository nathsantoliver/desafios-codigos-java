package bootClaro.basico;

import java.util.Scanner;

public class LimiteDeDadosMoveis {
    // Função para converter GB para MB
    public static int gbParaMb(double gb) {
        // Faça o calculo de conversão de GB para MB, sabendo que 1 GB = 1024 MB
        return (int) gb * 1024;
    }

    // Função principal para verificar o limite de dados móveis
    public static void verificarLimiteDeDados(double limiteGb, int consumoTotalMb) {
        // Convertendo o limite de GB para MB
        int limiteMb = gbParaMb(limiteGb);

        // Verifique se o consumo total excede o limite mensal em MB
        if (consumoTotalMb > limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMb - consumoTotalMb;
            System.out.println("Você ainda possui " + dadosDisponiveis + " MB disponíveis.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário o limite mensal de dados em GB
        double limiteGb = scanner.nextDouble();
        scanner.nextLine();

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();

        // Verificando o limite de dados móveis
        verificarLimiteDeDados(limiteGb, consumoTotalMb);

        scanner.close();
    }
}
