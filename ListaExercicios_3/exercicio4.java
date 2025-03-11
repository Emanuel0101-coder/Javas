/*Crie um m´etodo est´atico para calcular o nu´mero fibonacci. O m´etodo deve
retornar o valor calculado. Fa¸ca um m´etodo que calcule de maneira
iterativa e outro m´etodo que calcule de maneira recursiva. */

package ListaExercicios_3;

public class exercicio4 {

  public static void main(String[] args) {
    int x = 10;
    System.out.println("O fibonacci recursivo fica: " + fibonacci(x));
    System.out.println("O fibonacci iterativo fica: " + fibonacci_2(x));
  }
  //Recursiva
  public static int fibonacci(int x){
    if (x <= 0) return 0;
    if (x == 1) return 1;
    return fibonacci(x - 1) + fibonacci(x - 2);
  }
  //Iterativa
  public static int fibonacci_2(int x){
    if (x <= 0) return 0;
    if (x == 1) return 1;
    int a = 0;
    int b = 1;
    int resultado = 0;
    for(int i = 2; i <= x; i++){            //Como é fibonacci, o i tem que obrigatoriamente começar em 2
      resultado = a + b;                    //Soma os dois ultimos valores
      a = b;                                //Atualiza o 1 valor
      b = resultado;                        //Atualiza o 2 valor
    }
    return resultado;
    }
  }

