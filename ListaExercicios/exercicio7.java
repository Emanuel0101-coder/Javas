/*Implemente e analise o trecho de c´odigo abaixo */

package ListaExercicios;

public class exercicio7 {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;
    System . out . println ("x em binario = "+ Integer .toBinaryString ( x ) ) ;
    x = x << y ;
    System . out . println ("x = " + x ) ;
    System . out . println ("x em binario = "+ Integer .toBinaryString ( x ) ) ;
  }
}
