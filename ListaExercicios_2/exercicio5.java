/* Escreva um programa que imprima em tela a tabuada do número
informado pelo usuário. */

package ListaExercicios_2;

import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //Pede o numero
    System.out.println("Digite o numero: ");
    int numero = leitor.nextInt();
    for(int i = 1; i <= 10; i++){
      System.out.println(numero + " x " + i + " = " +(numero * i));
    }
    leitor.close();
  }
}
