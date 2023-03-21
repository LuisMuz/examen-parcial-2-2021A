package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];
        Instrumento instrumento = null;
        String NombreClase = "Guitarra";

        switch (args[1].toUpperCase()) {
            case "PIANO" -> instrumento = new Piano();
            case "GUITARRA" -> instrumento = new Guitarra();
            case "VIOLIN" -> instrumento = new Violin();
            case "FLAUTA" -> instrumento = new Flauta();
            default -> System.out.println("Ese instrumento no es valido");
        }

        if(instrumento != null){
            SongPlayer songPlayer = new SongPlayer();
            Song song = new Song(new File(fileName));

            songPlayer.play(song, instrumento);
        }

    }
}
