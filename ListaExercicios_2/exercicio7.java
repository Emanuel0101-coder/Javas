/*Escreva um programa que calcule a sequência Fibonacci solicitada pelo
usuário */

package ListaExercicios_2;

import java.util.Scanner;

public class exercicio7 {
  //Declarando a função
  public static int Fibonacci(int x){
    if (x <= 0) return 0;
    if (x == 1) return 1;
    return Fibonacci(x - 1) + Fibonacci(x - 2);
  }
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite numero: ");
    int x = leitor.nextInt();
    System.out.println(Fibonacci(x));
    leitor.close();
  }
}

//EXPLICAÇÃO DO MOTIVO DE USAR UMA FUNÇÃO RECURSIVA
/*
A recursão é um processo onde uma função chama a si mesma. Em vez de usar um loop explícito, 
recursão permite que a função execute o mesmo bloco de código repetidamente,
com valores diferentes, até que atinja uma condição de parada (caso base).
 */
