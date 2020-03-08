
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bladimir Minga
 * @author Steveen Ganchozo
 * @version 17/02/2020/A
 */
public class AudioTest {

    @Test
    public void reproducirAudio() {
        //Test para comprobar que solamente reproduce el audio, si existe el archivo.
        File file = new File("src/src/alarma1.mp3");
        assertTrue(file.exists());
    }

    @Test
    public void endAudio() {
        //Test para comprobar que el objeto BasicPlayer esta inicializado
        BasicPlayer sonido = new BasicPlayer();
        assertNotEquals(sonido, null);
    }
}
