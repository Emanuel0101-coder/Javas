package provaTreino;

public class dificil {
  public static void metodoA(double a){
    System.out.println("Metodo 3");
  }
  public static void metodoA(){
    System.out.println("Metodo 1");
  }
  public static void metodoA(long a){
    System.out.println("Metodo 5");
  }
  public static void metodoA(int a){
    System.out.println("Metodo 2");
  }
  public static void metodoA(float a){
    System.out.println("Metodo 4");
  }
  public static void main(String[] args) {
    metodoA(10.0f);
  }
}
