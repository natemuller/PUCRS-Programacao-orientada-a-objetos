public class Musica implements Comparable<Musica>{
    private String titulo;
    private String compositor;
    private int duracao; // em segundos

    public Musica(String titulo, String compositor, int duracao) {
        this.titulo = titulo;
        this.compositor = compositor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCompositor() {
        return compositor;
    }

    public double getDuracao() {
        return duracao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Musica)) return false;
        Musica musica = (Musica) obj;
        return titulo.equals(musica.titulo) && compositor.equals(musica.compositor);
    }

    @Override
    public int hashCode() {
        int result = titulo.hashCode();
        result = 31 * result + compositor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Musica: " + titulo + ", Compositor: " + compositor + ", com duração de " + duracao + " segundos.";
    }

    @Override
    public int compareTo(Musica outraMusica) {
        return this.titulo.compareTo(outraMusica.titulo);  
    }
}
