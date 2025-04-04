package provaTreino.trycatchteste;

public class Financiamento {
  public static double financiar(double valorTotal, double entrada, int parcelas){
    if (entrada < valorTotal * 0.2){
      throw new RuntimeException("A entrada deve ser superior a 20%.");
    } else if(parcelas < 6){
      throw new RuntimeException("As parcelas devem ser superiores a 6");
    } else if(entrada == valorTotal || entrada >= valorTotal){
      throw new RuntimeException("Parabens, voce quitou.");
    }
    return (valorTotal - entrada) / parcelas;
  }
}

