/*Escreva um classe chamada Main com um método estático que receba um
parâmetro decimal. O método deve validar a entrada e lançar uma exceção caso o valor
do parâmetro for negativo*/

package provaTreino;

public class decimaisexy {
  public static double decimal(double a){
    if (a >= 0){
      System.out.println("Ótimo, valor positivo!");
    } else {
      throw new ArithmeticException("Não aceitamos números negativos.");
    }
    return a;
  }
  public static void main(String[] args) {
    try{
      double a = 7.0;
      decimal(a);
    } catch(Exception fodase){
      System.out.println(fodase.getMessage());
    }
  }
}
