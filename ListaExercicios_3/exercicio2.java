/*Crie um m´etodo est´atico para imprimir um texto na cor vermelha. */

package ListaExercicios_3;

public class exercicio2 {

  public static void texto(String x){
    String tex = x;
    System.out.print("\u001b[31m");
    System.out.println(tex);
  }
  public static void main(String[] args) {
    System.out.println("Ola normal");
    texto("Ola vermelho");
    System.out.print("\u001b[0m");
  }
}
