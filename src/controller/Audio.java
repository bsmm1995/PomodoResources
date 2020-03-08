package controller;

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 * Esta clase contiene los métodos para reproducir archivos de audio
 *
 * @author Bladimir Minga
 * @author Steveen Ganchozo
 * @version 17/02/2020/A
 */
public class Audio {

    BasicPlayer sonido = null;

    /**
     * Método para reproducir un archivo de audio
     *
     * @param strFile Este parámetro contiene la ruta relativa del archivo .mp3
     * @throws javazoom.jlgui.basicplayer.BasicPlayerException Esta excepción
     * captura los errores que ocurriesen  al intentar reproducir el archivo de
     * audio
     */
    public void reproducirAudio(String strFile) throws BasicPlayerException {
        sonido = new BasicPlayer();
        File file = new File(strFile);
        if (file.exists()) {
            sonido.open(file);
            sonido.play();
        }
    }//Cierre del método reproducirAudio

    /**
     * Método que permite terminar la reproducción del audio
     *
     * @throws javazoom.jlgui.basicplayer.BasicPlayerException Esta excepción
     * captura los errores que ocurriesen al intentar reproducir el archivo de
     * audio
     */
    public void endAudio() throws BasicPlayerException {
        if (sonido != null) {
            sonido.pause();
            sonido.stop();
        }
    }//Cierre del método endAudio
}//Cierre de la clase Audio
