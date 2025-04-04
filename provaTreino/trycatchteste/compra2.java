package provaTreino.trycatchteste;

public class compra2 {
  public static void main(String[] args) {
    double Eu = 1000.0;
    double Vou = 1000.0;
    int gozar = 10;
    try{
      System.out.println("O seu financimaneto deu: R$" + Financiamento.financiar(Eu, Vou, gozar));
    }catch(RuntimeException satorugojo){
      System.out.println("Erro seu otario: " + satorugojo.getMessage());
    }
  }
}
