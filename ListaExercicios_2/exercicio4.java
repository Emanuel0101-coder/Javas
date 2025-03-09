/* Escreva um programa que calcule a média final em um bimestre. O
usuário deve informar quantas atividades teve no bimestre. Em seguida, o
programa deve solicitar as notas de cada atividade e calcular a média
aritmética. Apresente o resultado em tela.
*/

package ListaExercicios_2;

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite quantas atividades vc teve: ");
    int atividades = leitor.nextInt();

    if(atividades == 0){
      System.out.println("Programa encerrado");       //Caso seja 0 informado
    } else{
      double soma = 0;                                //Double usado para casas decimais
      for (int i = 1; i < atividades + 1; i++){         
        System.out.println("Digite sua nota da " + i + " atividade:");
        double notas = leitor.nextDouble();
        soma += notas;
    }
    double media = soma/atividades;                   //Caso a média de um numero quebrado, o double é melhor uso
    System.out.println("Sua media foi: " + media);
    }
    leitor.close();         //SEMPRE FECHEM O SCANNER
  }
}


/* EXPLICAÇÃO DO DOUBLE:
Basicamente, o double é usado para que possamos calcular apartir de casas decimais
coisa que se for declarado como Int pode gerar erros.
 */