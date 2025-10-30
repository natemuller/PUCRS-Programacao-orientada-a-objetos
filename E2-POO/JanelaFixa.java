public class JanelaFixa extends Janela {

    private String localizacao;

    public JanelaFixa (String nome, int largura, int altura, String localizacao) {
        super(nome, largura, altura);
        this.localizacao = localizacao;
    }

    public String toString () {
        return "Janela '" + this.getNome() + "' [largura=" + this.getLargura() + ", altura=" + this.getAltura() + ", localizacao=" + this.localizacao + "]";
    }
}
