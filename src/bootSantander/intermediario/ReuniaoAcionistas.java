package bootSantander.intermediario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ReuniaoAcionistas {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        String dataInicial = scan.nextLine();
        String dataFinal = scan.nextLine();

        SistemaAcionistas sistemasAcionistas = new SistemaAcionistas();
        List<String> analises = sistemasAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

        for(String analise : analises) {
            System.out.println(analise);
        }
    }
}

class SistemaAcionistas {
    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        // Simula uma base de dados em uma lista de análises:
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacoes e Tecnologia"));

        // TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para armazenar
        // TODO: as análises filtradas e use um loop for para filtrar as análises.
        List<String> analisesPorData = new ArrayList<>();
        for(Analise a : analises) {
            if(a.data.compareTo(dataInicial) >= 0 && a.data.compareTo(dataFinal) <= 0) {
                analisesPorData.add(a.descricao);
            }
        }

        // TODO: Retorne a lista de análises filtradas.
        return analisesPorData;
    }
}

class Analise {
    Date data;
    String descricao;

    public Analise(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }
}
