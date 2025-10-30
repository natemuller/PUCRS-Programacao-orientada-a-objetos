public class Janela {
    
    private String nome;
    private int largura;
    private int altura;

    public Janela (String nome, int largura, int altura) {
        this.nome = nome;
        this.largura = largura;
        this.altura = altura;
    }

    public String toString () {
        return "Janela '" + this.getNome() + "' [largura=" + this.getLargura() + ", altura=" + this.getAltura() + "]";
    }

    public String getNome() {
        return nome;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }
}
