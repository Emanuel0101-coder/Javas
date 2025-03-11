/*Crie um m´etodo est´atico para comparar dois nu´meros e retonar o menor
valor. */

package ListaExercicios_3;

public class exercicio7 {
  public static String comparar(int a, int b){
    String frase = "Os dois numeros sao iguais.";
    if (a > b){
      return b + "";
    } else if(a < b) {
      return a + "";
    } else {
      return frase;
    }
  }
  public static void main(String[] args) {
    System.out.println(comparar(5, 10));
  }
}
