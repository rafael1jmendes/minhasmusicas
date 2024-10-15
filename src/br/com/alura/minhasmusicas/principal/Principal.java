package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++ ) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++ ) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++ ) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 3000; i++ ) {
            meuPodcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
