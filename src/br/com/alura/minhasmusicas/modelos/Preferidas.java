package br.com.alura.minhasmusicas.modelos;

public class Preferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println("Melhores indicacoes para voce: " + audio.getTitulo() );

        } else {
            System.out.println(audio.getTitulo() + " nao e das mais tocadas, mas ainda sim conquista seus fans");
        }
    }
}
