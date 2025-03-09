/*Escreva um programa em java que receba dois textos. Verifique se os dois
textos são iguais e apresente o resultado em tela. Observe e analise os
resultados.*/

package ListaExercicios;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro texto: ");
        String x = leitor.nextLine();

        // Experimente dividir por Zero
        System.out.println("Digite o segundo texto: ");
        String y = leitor.nextLine();
        boolean resultado = x == y;
        System.out.println(" x == y ? "+resultado);
        leitor.close();
    }
}

