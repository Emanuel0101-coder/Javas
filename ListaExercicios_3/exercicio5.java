/*Crie um m´etodo est´atico para calcular a ´area de um c´ırculo. O m´etodo
deve retornar o valor calculado. */
package ListaExercicios_3;

public class exercicio5 {
  public static void main(String[] args) {
    System.out.println("A area do ciruclo e: " + area(10));       //10 sendo usado como referencia
  }
  public static double area(double x){
    double pi = Math.PI;
    double area = pi*(Math.pow(x, 2));
    return area;
  }
}
