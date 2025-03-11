/*Crie um m´etodo est´atico para verificar se uma equa¸c˜ao do 2 grau possui
solu¸c˜oes reais. O m´etodo deve receber por parˆametro os valores de a,b e c
e retornar verdadeiro ou falso. ax^2 + bx + c = 0 e x = -b ± √(b² – 4ac)/ 2a
*/
package ListaExercicios_3;


public class exercicio6 {
  public static boolean bhaskara(int a, int b, int c){
    double auxSoma = (-b + Math.sqrt((Math.pow(b, 2)) - 4 * a * c))/2 * a;
    double auxSub = (-b - Math.sqrt((Math.pow(b, 2)) - 4 * a * c))/2 * a;
    if (Double.isNaN(auxSoma) && Double.isNaN(auxSub)){
      return false;
    }else{
      return true;
    }
  }
  public static void main(String[] args) {
    System.out.println(bhaskara(1, 2, -3));
  }
}
