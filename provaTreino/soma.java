package provaTreino;

import java.util.Scanner;
public class soma{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe numero: ");
    int num1 = leitor.nextInt();
    System.out.println("Informe mais um: ");
    int num2 = leitor.nextInt();
    int soma = num1 + num2;
    System.out.println(soma);
    leitor.close();
  }
}

