/*Escreva um programa em java que receba um número. O programa deve
encerrar quando o usúario informar -1. Caso contrário o programa deverá
pedir novamente um número */

package ListaExercicios_2;

import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int numero;            //variavel foda

    do {
      System.out.println("Digite numero: ");
      numero = leitor.nextInt();          //ler o numero dentro do loop
    } while( numero != -1);
    
    System.out.println("Programa encerrado.");
    leitor.close();
  }
}

//Explicação do pq usar o do-while aqui:
/*
  É utilizado para que o bloco de código dentro do "do" seja executado pelo menos 1 vez
  ai SOMENTE depois ele verifica se aquela condição é atendida, caso o contrário se ela não for
  atendida, o bloco do "do" é executado novamente.
 */