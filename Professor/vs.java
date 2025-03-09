package Professor;
import java.util.Scanner;

public class vs {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int x = leitor.nextInt();
    if (x > 0){
      System.out.println("Numero é positivo.");
    }else if(x < 0){
      System.out.println("Numero é negativo.");
    } else{
      System.out.println("Zero");
    }
    leitor.close();
  }
}
