package Professor;
import java.util.Scanner;
public class hello {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = leitor.nextInt();
        System.out.println("X = " + x);
        leitor.close();
    }
}


