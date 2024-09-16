package bootDeal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DelElementos {
    private Map<Integer, String> table;

    public DelElementos() {
        this.table = new HashMap<>();
    }

    public void insert(int key, String value) {
        table.put(key, value);
    }

    // Metodo para deletar um elemento da tabela usando sua chave (ID)
    public void delete (int key) {
        table.remove(key);
    }

    public void display() {
        for (String name : table.values()) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DelElementos table = new DelElementos();

        // Inserindo dados para exemplo
        table.insert(1, "Alice");
        table.insert(2, "Bob");
        table.insert(3, "Charlie");
        table.insert(4, "Paula");
        table.insert(5, "Gabriela");
        table.insert(6, "Luiza");


        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int id = scanner.nextInt();
            table.delete(id);
        }

        table.display();
        scanner.close();
    }
}
