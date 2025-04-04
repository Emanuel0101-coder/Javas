package ListaExercicios_4;

public class Foda {
  public static double media(int vetor[]){
    if(vetor.length == 0){
      System.out.println("Elemento nulo.");
    }
    int soma = 0;
    for (int num : vetor){
      soma += num;
    }
    return (double) soma/vetor.length;    
  }
  public static void main(String[] args) {
    int vetor[] = {10, 20, 30, 40};
    System.out.println(media(vetor));
  }
}
