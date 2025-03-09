/*Escreva um programa em java que receba dois inteiros. Realize a divis˜ao
entre os n´umeros e apresente o resultado em tela. Observe o que acontece
quando se divide um n´umero por zero.
 */
package ListaExercicios;

import java.util.Scanner;

public class exercicio3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = scanner.nextInt();
    System.out.println("Digite outro numero: ");
    int numero2 = scanner.nextInt();
    int divisao = numero / numero2;
    System.out.println("A divisao dos dois numeros: " + divisao);
    scanner.close();
  }
}
