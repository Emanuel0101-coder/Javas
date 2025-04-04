package Professor;

public class vetores {
  public static void main(String[] args) {
    //int vetor[] = null;                                  //tem qual tamanho? Nao tem tamanho
    //int v[] = {1, 2, 3, 4};   
    double d[] = new double[10];
    char e[] = new char[10];
    System.out.println(e);
    System.out.println(d);                         
    int vetor[] = new int[10];                             //vetor com zero
    //posição -> 0 até o tamanho -1
    vetor[0] = 99;
    System.out.println(vetor[0]);
    System.out.println(vetor.length);
    System.out.println(vetor[vetor.length - 1]);
    //System.out.println((vetor[10]));                      //Vai dar erro, posição invalida
    //for clássico
    for (int i = 0; i < vetor.length; i++){
      System.out.println("vetor["+ i +"] = " + vetor[i]);
    }
    //far - loop, percorre o vetor
    //da primeira posição até a última
    for (int elemento : vetor){
      System.out.println(elemento);
    }
  }
}
