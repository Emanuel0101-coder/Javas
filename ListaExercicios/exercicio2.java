package ListaExercicios;
/*Escreva um programa em java que receba um inteiro. Verifique se o valor
´e par ou ´ımpar. Apresente o resultado em tela */
import java.util.Scanner;

public class exercicio2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");       
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        scanner.close();
    }
}

