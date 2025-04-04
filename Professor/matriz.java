package Professor;

public class matriz {
  public static void main(String[] args) {
    int cubo[][][] = new int[10][10][10];
    //Matriz 3x3
    int m[][] = new int[3][3];
    m[0][0] = 3;
    m[1][1] = 3;
    m[2][2] = 3;
    //linhas * colunas. N ao quadrado = Notação assintócia 0 (n ao quadrado)
    for (int i = 0; i < m.length; i++){         //N
      for (int j = 0; j < m[i].length; j++){      //N
        System.out.print(m[i][j]);
      }
      System.out.println();
    }
    for (int vetor[]: m ){
     for (int elemento: vetor){
      System.out.println(elemento);
     }
    }
  }
}
