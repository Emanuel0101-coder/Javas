/*Escreva um programa em java que receba um inteiro. Realize a soma do
número 1 até o valor informado pelo usúario. Apresente o resultado em
tela. */


package ListaExercicios_2;

import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite numero: ");
    int numero = leitor.nextInt();          //Declaração de variavel
    int soma = 0;                           //Declaração de variavel
    for(int i = 1; i <= numero; i++){
      soma += i;
    }
    System.out.println("A soma é:" + soma);
    leitor.close();
  }
}
