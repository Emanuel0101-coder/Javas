package provaTreino;

public class provaExercicio {
  public static void main(String[] args){
    int vetor [ ] = {1 , 2 , 4 } ;
    System.out.println(vetor[4]) ;
    System.out.println(soma(5,10));
  }
  public static int soma(int a, int b){
    int somar = a + b;
    return somar;
  }
  public static double dobro(double a){
    if (a >= 0){
      System.out.println("Entrada validada");
    } else{
      System.out.println("entrada invalidade");
    }
    return a;
  }
}

