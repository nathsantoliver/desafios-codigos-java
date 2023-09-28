package bootSantander.basico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrganizandoAtivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        System.out.print("Digite a quantidade de Ativos: ");  // Apenas para teste
        // Entrada de tipos de ativos
        int quantidadeAtivos = scan.nextInt();
        scan.nextLine();    // Método para limpar o buffer do scanner

        // Entrada dos códigos dos ativos
        for (int i = 1; i <= quantidadeAtivos; i++) {
//            if(i > 1) {
            System.out.print("Digite o Código do ativo numero " + i + ": ");  // Apenas para teste
            String codigoAtivo = scan.nextLine();
            ativos.add(codigoAtivo);
        }

        // Ordenar os ativos em ordem alfabetica
        List<String> ativosList = new ArrayList<>(ativos);
        Collections.sort(ativosList);

        // Imprimir a lista de ativos ordenada, conforme a tabela de exemplos
        for (String ativo : ativosList) {   // para cada String ativo dentro de ativosList
            System.out.println(ativo);

        }

    }
}
