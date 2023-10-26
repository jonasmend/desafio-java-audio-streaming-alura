package br.com.audiostreaming.principal;

import br.com.audiostreaming.modelos.MinhasPreferidas;
import br.com.audiostreaming.modelos.Musica;
import br.com.audiostreaming.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Time");
        minhaMusica.setArtista("Pink Floyd");
        for(int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for(int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow");
        meuPodcast.setApresentador("Igão e Mitíco");
        for(int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }
        for(int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);
    }
}
