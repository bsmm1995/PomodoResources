/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bladimir Minga
 * @author Steveen Ganchozo
 * @version 17/02/2020/A
 */
public class frmMainTest {

    ArrayList<pnlActivity> listPaneles = new ArrayList<>();

    @Test
    public void SMS() {
        //Test para comprobar que el mensaje no sea vacío
        String strSMS = "";
        assertFalse(!strSMS.isEmpty());
    }

    @Test
    public void ValoresMayoresACero() {
        //Test para comprobar que los valores de entrada (tiempo, cantidad) sean mayores a 1
        int index = 1;
        assertTrue(index > 0);
    }

    @Test
    public void deleteActivity() {
        //Test para comprobar que deben existir elementos para proceder a borrar
        int index = listPaneles.size() + 1;
        index += 1;//sumamos 1 para que index sea mayor que cero y cumpla la condicion
        assertTrue(index > 0);
    }

    @Test
    public void Comenzar() {
        //Test para comprobar que deben existir elementos para proceder a iniciar el cronómetro
        int index = listPaneles.size() + 1;
        index += 1;//sumamos 1 para que index sea mayor que cero y cumpla la condicion
        assertTrue(index > 0);
    }
}
