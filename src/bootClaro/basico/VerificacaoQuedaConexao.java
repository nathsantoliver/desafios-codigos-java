package bootClaro.basico;

import java.util.Scanner;

public class VerificacaoQuedaConexao {
    // Preencha a função para verificar queda de conexão
    public static String verificaQuedaConexao(String[] velocidades) {
        boolean quedaConexao = false;

        for (String velocidade : velocidades) {
            if (velocidade.matches("0")) {
                quedaConexao = true;
                break;
            }
        }

        if (quedaConexao) {
            return "Queda de Conexao";
        } else {
            return "Sem Quedas";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificaQuedaConexao(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println(resultado);

        scanner.close();
    }
}
