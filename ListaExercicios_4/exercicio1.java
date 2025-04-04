/*Escreva um programa em java que realize a busca de um nu´mero em um
vetor. O vetor deve ser preenchido com valores aleat´orios. Caso o valor
existir no vetor, apresente a sua posi¸c˜ao. Caso contr´ario, informe que o
valor n˜ao existe no vetor. */
package ListaExercicios_4;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int tamanho = 20; 
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        // Exibir o vetor gerado
        System.out.println("Vetor gerado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Pedir um número ao usuário para buscar no vetor
        System.out.print("Digite um número para buscar no vetor: ");
        int numeroBuscado = leitor.nextInt();

        // Buscar o número no vetor
        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
            }
        }

        // Se o número não for encontrado, exibir mensagem
        if (!encontrado) {
            System.out.println("O número " + numeroBuscado + " não existe no vetor.");
        }

        leitor.close();
    }
}


