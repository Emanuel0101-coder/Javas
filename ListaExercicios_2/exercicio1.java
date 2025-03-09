/*Escreva um programa em java que realize a soma dos números entre 1 e
1000. Utilize uma estrutura de repeticão e apresente o resultado em tela. */

package ListaExercicios_2;

public class exercicio1 {
  public static void main(String[] args) {
    int soma = 0;
    for(int i = 1; i <= 1000; i ++ ){
      soma += i;
    }
    System.out.println("A soma é:" + soma);
  }
}