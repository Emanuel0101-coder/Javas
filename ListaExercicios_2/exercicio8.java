/*Escreva um programa que gere aleatóriamente um número ( por exemplo,
entre 1 e 10) e peça para o usuário adivinhar. O programa deve dizer se o
número informado pelo usúario é maior ou menor que o número sorteado.
O programa finaliza quando acaba as tentativas ou quando o usuário
acerta o número sorteado. Utilize a classe Random para sortear o número */

package ListaExercicios_2;

import java.util.Random;
import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {
    Random random = new Random ();
    Scanner adivinha = new Scanner(System.in);

    System.out.println("Tente adivinhar o numero sorteado! (1 a 10): ");
    int numero = adivinha.nextInt();
    int x = random.nextInt(10);
    int tentativas = 3;

      do {
        System.out.println("Tente de novo!: " + "Tentativas restantes: " + tentativas);
        tentativas--;
        if (numero > x){
          System.out.println("O numero é maior que o sorteado");
        } else {
          System.out.println("O numero é menor que o sorteado");
        }
        numero = adivinha.nextInt();
      } while(x != numero && tentativas > 0);

    if (numero == x){
      System.out.println("Parabens, voce acertou o numero!");
    } else {
      System.out.println("Suas tentativas acabaram.");
      System.out.println("O numero era: " + x);
    }
    adivinha.close();
  }
}

