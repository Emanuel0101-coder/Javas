/*Escreva um programa que imprima em tela as tabuadas de 1 até 10. */

package ListaExercicios_2;

public class exercicio6 {
  public static void main(String[] args) {
    for(int j = 1; j <= 10; j++ ){
        System.out.println("Tabuada do " + j);
        for(int i = 1; i <= 10; i++){
          System.out.println(j + " x " + i + " = " +(j * i));
      }
    }
  }
}
