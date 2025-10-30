/*
| E3 Individual
| Realize as tarefas solicitadas.
| Talvez seja necessário completar o código das demais classes.
*/


import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        
        // Algumas musicas gerais
        Musica musica1 = new Musica("Beat It", "Michael Jackson", 240);
        Musica musica2 = new Musica("The Song Remains the Same", "Led Zeppelin", 180);
        Musica musica3 = new Musica("Bohemian Rhapsody", "Queen", 300);

        // Playlists de Zeca e Maria
        Playlist playlistZeca = new Playlist("Preferidas do Zeca");
        playlistZeca.adicionar(musica1);
        playlistZeca.adicionar(musica2);

        Playlist playlistMaria = new Playlist("Preferidas da Maria");
        playlistMaria.adicionar(musica2);
        playlistMaria.adicionar(musica3);

        // Minha playlist
		// TAREFA 1: Crie sua própria playlist e pelo menos mais 3 músicas de sua preferência
		// ... seu código ...	

        Playlist minhaPlaylist = new Playlist("Preferidas do Natan");	
        Musica musica4 = new Musica("WILDFLOWER", "Billie Eilish", 300);
        Musica musica5 = new Musica("The Nameless", "Slipknot", 400);   // A duração de todas as músicas não condizem, não sei de cabeça o tempo certo!
        Musica musica6 = new Musica("Evil Papagali", "Massacration", 500);
        Musica musica7 = new Musica("Shades of cool", "Lana del Rey", 240);	
		
		// TAREFA 2: Adicione as 3 músicas de sua preferência na sua playlist
		// ... seu código ...
		
        minhaPlaylist.adicionar(musica4);
        minhaPlaylist.adicionar(musica5);
        minhaPlaylist.adicionar(musica6);
        minhaPlaylist.adicionar(musica7);      

		// TAREFA 3: Adicione a 'musica1' na sua playlist também.
        // ... seu código ...

        minhaPlaylist.adicionar(musica1);
		
        // TAREFA 4: Crie uma coleção que contenha as suas
		// musicas que são em comum com a playlist do Zeca e exiba essa coleção na tela.
		// ... seu código ...

        HashSet<Musica> minhasMusicasEmComum = new HashSet<Musica>();
        minhasMusicasEmComum.addAll(playlistZeca.getMusicas());
        minhasMusicasEmComum.retainAll(minhaPlaylist.getMusicas());
        
        System.out.println("\nMinhas músicas em comum com a playlist do Zeca::\n");
        for (Musica musica : minhasMusicasEmComum) {
            System.out.println(musica);
        }

        // TAREFA 5: Adicione todas as musicas da Maria na sua playlist, mas sem repetir.
        System.out.println("\nAdicionando músicas da playlist de Maria na minha playlist:");
		// ... seu código ...

        minhasMusicasEmComum.addAll(playlistMaria.getMusicas());
        minhaPlaylist.getMusicas().addAll(minhasMusicasEmComum);
		
        // Exibir todas as musicas da minha playlist atualizada
        System.out.println("\nTodas as músicas na minha playlist:\n");
        for (Musica musica : minhaPlaylist.getMusicas()) {
            System.out.println(musica);
        }

        // Exibir a quantidade de músicas na minha playlist
        System.out.println("\nQuantidade de músicas na minha playlist: " + minhaPlaylist.getQtdMusicas());
        
    }
}

//======================================================================
// Escreva aqui sua nota de auto-avaliação (0 a 10): 10
// Seu nome completo: Natan de Aragao Muller
//======================================================================

/*
    Nota: quebrei a cabeça com a exceção ClassCastException que deu logo quando fui tentar rodar o programa pela primeira vez,
    acabei solucionando olhando a resolução da atividade da Biblioteca Digital feita em aulas anteriores e, lendo a página do Docs Oracle.
*/