/*O método main que inicia a execução de um programa java possui um
parâmetro do tipo vetor de String. Crie um programa que apresente em
tela o tamanho do vetor e o seu conteúdo.
Na linha de comando, execute o seu programa da seguinte maneira: */

package ListaExercicios_4;

public class exercicio2 {
  public static void main(String[] args) {
      // Mostra o tamanho do vetor args
      System.out.println("Número de argumentos: " + args.length);

      // Exibe o conteúdo do vetor args
      System.out.println("Conteúdo dos argumentos:");
      for (int i = 0; i < args.length; i++) {
          System.out.println("args[" + i + "] = " + args[i]);
      }
  }
}


