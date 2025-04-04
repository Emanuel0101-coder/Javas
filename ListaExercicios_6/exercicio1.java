package ListaExercicios_6;

public class Lampada {
    private boolean ligada; 

    public Lampada() { 
        this.ligada = false; // Inicialmente desligada
    }

    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    public void estado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada(); // Criando a primeira lâmpada
        Lampada lampada2 = new Lampada(); // Criando a segunda lâmpada

        lampada1.estado(); // Deve imprimir "A lâmpada está desligada."
        lampada1.ligar();  // Ligando a lâmpada
        lampada1.estado(); // Deve imprimir "A lâmpada está ligada."

        lampada2.estado();  // Deve imprimir "A lâmpada está desligada."
        lampada2.desligar(); // Já estava desligada, mas executa o método
        lampada2.estado();  // Deve imprimir "A lâmpada está desligada."
    }
}
