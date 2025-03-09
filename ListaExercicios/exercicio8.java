/*Implemente a função Beale de acordo com a fórmula abaixo: A função
possui duas varíaeis x e y. As varíaveis podem possuir os valores entre
[-4.5, 4.5]. O resultado da função é zero quando x = 3 e y = 0.5.
 */

package ListaExercicios;
public class exercicio8 {

  //Método que implementa a função de Beale
    public static double muitoFoda(double x, double y) {      //declarado como double pra poder elevar ao quadrado
      return Math.pow((1.5 - x + x * y), 2) +               //B:2 é pra dizer que é elevado ao quadrado, usando o metodo math.pow
             Math.pow((2.25 - x + x * Math.pow(y, 2)), 2) +
             Math.pow((2.625 - x + x * Math.pow(y, 3)), 2);
  }

  public static void main(String[] args) {
      //declarando variaveis, o double é como se fosse o float do python
      double x = 3.0;
      double y = 0.5;
      
      //Chamando a função de Beale
      double resultado = muitoFoda(x, y);
      
      //O Resultado deve ser 0
      System.out.println("Beale Function Result at (x = 3, y = 0.5): " + resultado);
  }
}
