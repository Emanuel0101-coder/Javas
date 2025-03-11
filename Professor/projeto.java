package Professor;

public class projeto {
  //Static -> Mudar de escopo -> escopo de classe
  //Vai ser global -> tem apenas uma vez carregado na memoria
  //Visibilidade static retorno nome_do_projeto(lista de parametros)
  public static void main(String[] args) {
    metodoA();
    int i = metodoB();
    System.out.println(i);
    metodoC(2.0);
    metodoC(1.0,1);
  }

  public static void metodoA(){
    System.out.println("Olá");
    return;
  }

  public static int metodoB(){
    int x = 0;
    if (x == 1){return -1;}
    return 0;
  }
  //Assinatura de metodo
  //Com 1 parametro
  public static void metodoC(int x){
    x = 99;
  }
  public static void metodoC(double x){
    
  }
  //Assinatura de metodo
  //Com 2 parametro
  public static void metodoC(double x, int y){
    
  }
  public static void metodoC(int x, double y){
    
  }
  //Assinatura de metodo
  //Com 3 parametros
  public static void metodoC(int x, double y, int w){
    
  }
}
