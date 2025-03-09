package Professor;
public class operadorTernario {
  public static void main(String[] args) {
    int x = 0;
    String texto = (x % 2 == 0) ? "par" : "impar"; // Usa operador ternário para atribuir o valor

    System.out.println(x + " é " + texto); // Usa a variável texto na saída
  }
}
