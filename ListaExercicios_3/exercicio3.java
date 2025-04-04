/*Crie um método estático para calcular a potência de um número inteiro. O
m´etodo deve retornar o valor calculado. N˜ao utilize as fun¸c˜oes prontas da
linguagem. */

package ListaExercicios_3;

public class exercicio3 {
  public static int potencia(int x, int y){
    int p = 1;
    for(int i = 1; i <= y; i++){
      p = p * x;
    }
    return p;
  }
  public static void main(String[] args) {
    System.out.println(potencia(5,3));
    System.out.println(dobro(5,10));
  }
  public static int dobro(int a, int b){
    int dobro =  a * 2;
    dobro = b * 2;
    return dobro;
  }

}

