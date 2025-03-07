package ListaExercicios;
/*Escreva um programa em java que declare uma vari´avel do tipo inteiro.
Atribua o maior valor poss´ıvel para essa vari´avel. Some mais 1 e apresente
o resultado em tela. Observe e analise o resultado*/

public class exercicio1 {
  public static void main(String[] args) {
      int maxInt = Integer.MAX_VALUE; // Atribuindo o maior valor possível para um int
      System.out.println("Maior valor de int: " + maxInt);
      
      int resultado = maxInt + 1; // Adicionando 1 ao maior valor possível
      System.out.println("Resultado após somar 1: " + resultado);
  }
}

