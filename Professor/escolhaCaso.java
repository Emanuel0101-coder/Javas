package Professor;
public class escolhaCaso {
  public static void main(String[] args) {
    //switch - case
    int x = 2;
    switch (x){
      case 0:   //Se o valor de x for zero
        System.out.println("Zero");
        break;
      case 1:   //Se o valor de x for 1
        System.out.println("Um");
        break;
      case 2:   //Se o valor de x for 2
        System.out.println("Dois");
        break;
      default:  //Se nao for nenhum dos cases
        System.out.println("Nenhum dos cases");
    }
  }
}
