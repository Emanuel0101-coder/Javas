package ListaExercicios_4;
//import java.util.Arrays;


public class XTest {
	public static int buscar(int vetor[], int elemento){
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] == elemento){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
			int[] vetor = {10, 20, 30, 40};
			int resultado = XTest.buscar(vetor, 50);

			if (resultado == -1) {
					System.out.println("Teste passou! O método retornou -1 como esperado.");
			} else {
					System.out.println("Teste falhou! Esperado: -1, Obtido: " + resultado);
			}
	}
}

