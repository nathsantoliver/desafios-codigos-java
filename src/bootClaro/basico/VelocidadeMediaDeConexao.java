package bootClaro.basico;

import java.util.Scanner;

public class VelocidadeMediaDeConexao {
    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int velocidadeTotal = 0;

        // Some todas as velocidades registradas e calcule a média
        for (String velocidade : velocidades) {
            int vel = Integer.parseInt(velocidade);
            velocidadeTotal += vel;
            total++;
        }

        return (double) velocidadeTotal / total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidaded média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}
