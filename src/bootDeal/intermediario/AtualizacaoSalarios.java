package bootDeal.intermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizacaoSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Funcionario2> funcionarios = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new Funcionario2(nome, departamento, salario));
        }

        double aumento = scanner.nextDouble();


        for (Funcionario2 f : funcionarios) {
            f.salario = f.salario * (1 + aumento / 100);
            System.out.printf("Nome: %s - Salario: %.2f\n", f.nome, f.salario);
        }

        scanner.close();
    }
}

class Funcionario2 {
    String nome;
    String departamento;
    double salario;

    Funcionario2(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
}
