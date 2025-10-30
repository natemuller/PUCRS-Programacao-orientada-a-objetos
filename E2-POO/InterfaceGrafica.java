import java.util.ArrayList;

public class InterfaceGrafica {

    private ArrayList<Janela> janelas;

    public InterfaceGrafica() {
        this.janelas = new ArrayList<Janela>();
    }

    public void adicionar (Janela janela) {
        this.janelas.add(janela);
    }

    public void desenhar () {
        for (Janela janela : janelas) {
            System.out.println(janela);
        }
    }
}