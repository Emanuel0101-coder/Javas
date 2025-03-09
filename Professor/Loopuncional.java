package Professor;
import java.util.ArrayList;  // Importação correta da classe

public class Loopuncional {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();  // Nome correto da classe
        
        for (int i = 10; i > 0; i--) {  // Corrigida a condição do loop
            lista.add(i);  // Adicionando corretamente os números
        }

        for (var i : lista) {  // Loop for-each
            System.out.println(i);  // Impressão direta sem concatenação desnecessária
        }

        System.out.println("---------");
        // Aqui poderia vir o loop funcional, como uso de streams em Java 8+
    }
}

