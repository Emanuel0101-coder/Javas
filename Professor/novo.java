package Professor;

public class novo {
  public static void main(String[] args) {
    //tente
    //RuntimeException -> tipo nao verificado
      try{
        int vetor[] = {0};
        vetor[10] = 10;
        return;       //Finalza o metodo e retorna um valor
    //catch - capturar - Um erro/Excecao
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
      e.printStackTrace();
    } finally {
      //este bloco sempre e executado
      //Depois do try e dos catch 
      System.out.println("Estou no finally");
    }
  }
  public static void lancarUmaExececao(int a){
    if (a < 0){
      throw new Exception("Parametro invalido. Numero negativo");
    }
  lancarUmaExececao(a);
  }
}


