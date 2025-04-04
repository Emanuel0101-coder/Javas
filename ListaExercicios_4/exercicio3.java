/*Crie um método estático que receba uma matriz com 2 dimensões e
calcule:
A soma dos elementos da primeira coluna;
O produto dos elementos da primeira linha;
A soma de todos os elementos;
O produto da diagonal principal. */

package ListaExercicios_4;

public class exercicio3 {
  public static void calcularMatrizes(int[][] matriz){
    int somaPrimeiraColuna = 0;
    int produtoPrimeiraLinha =  1;
    int somaTotal = 0;
    int produtoDiagonal = 1;

    int linhas = matriz.length;
    int colunas = matriz[0].length;

    for(int i = 0; i < linhas; i++){
      for(int j = 0; j < colunas; j++){
        somaTotal += matriz[i][j];

        if (j == 0){
          somaPrimeiraColuna += matriz[i][j];
        }
        if (i == 0){
          produtoPrimeiraLinha *= matriz[i][j];
        }
        if (i == j){
          produtoDiagonal *= matriz[i][j];
        }
      }
    }
    System.out.println("A soma da primeira coluna: " + somaPrimeiraColuna);
    System.out.println("A soma total deu: " + somaTotal);
    System.out.println("O produto da primeira linha: " + produtoPrimeiraLinha);
    System.out.println("O produto da diagonal principal: " + produtoDiagonal);
  }
  public static void main(String[] args) {
    int[][] matriz = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
    calcularMatrizes(matriz);
  }
}
