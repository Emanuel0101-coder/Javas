/*Crie um m´etodo est´atico que receba um nu´mero inteiro positivo e retorne
true se ele for primo e false caso contr´ario. */

package ListaExercicios_3;

public class exercicio8 {
  public static boolean primoFODA(int x){
    if (x % 2 == 0 && x % x == 0){                      //&& o famoso "and" do python
      System.out.println("Ele e primo.");
      return true;                                      //autoexplicativo
    } else {
      System.out.println("Ele nao e primo.");
      return false;
    }
  }
  public static void main(String[] args) {
    System.out.println(primoFODA(79));               //teste usando o numero 79
  }
}
