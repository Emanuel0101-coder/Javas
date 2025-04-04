package provaTreino;

public class decisaofinal {
  public static void main(String[] args) {
    try{
      int a = 1;
      int b = 2;
      String s = null;
      System.out.println(s.toLowerCase());
    } catch (ArithmeticException e){
      System.out.println("erro 1");
    } catch (Exception e){
      System.out.println("erro 2");
    } finally{
      System.out.println("fim");
    }
  }
}
