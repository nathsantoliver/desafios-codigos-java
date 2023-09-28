package bootCloudAWS;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MonitAnaliseLogsAWS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];

            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        Map.Entry<String,Long> maiorServico = eventosPorServico.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElseThrow(NoSuchElementException::new);

        Map.Entry<String,Long> menorServico = eventosPorServico.entrySet().stream()
                .min(Map.Entry.comparingByValue()).orElseThrow(NoSuchElementException::new);


        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((nomeServico, qtdLogs) -> System.out.println(nomeServico + ":" + qtdLogs));

        System.out.println("Maior:" + maiorServico.getKey());
        System.out.println("Menor:" + menorServico.getKey());

        scanner.close();
    }
}
