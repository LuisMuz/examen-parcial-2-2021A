package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;

public class SongPlayer {

    public void play(Song song, Instrumento instrumento) {

        Iterator<Nota> notas = song.getSongIterator();

        while (notas.hasNext()) {
            Nota nota = notas.next();
            instrumento.reproduceNota(nota);
        }

    }

}
