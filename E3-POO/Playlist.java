import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Playlist {
    private String nome;
    private Set<Musica> musicas = new TreeSet<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionar (Musica musica) {
        return musicas.add(musica);
    }

    public int getQtdMusicas () {
        return musicas.size();
    }

    public Collection<Musica> getMusicas() {
        return musicas;
    }
}
