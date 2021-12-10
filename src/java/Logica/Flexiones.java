/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Flexiones extends Ejercicio{
    
    public String escogerEjercicioF(){
        ArrayList descripcion = new ArrayList();
        descripcion.add("Abre tus manos a la altura de tus hombros y un poco "
                        + "más abiertas que los mismos, el tronco debe estar "
                        + "recto y deberas bajar hasta casi tocar el suelo con"
                        + " tu pecho.");
        descripcion.add("Pon tus manos a la altura de tu pecho y a la mitad de "
                        + "este, juntando los dedos indices y pulgares formando"
                        + " así un diamante con tus manos, el tronco debe estar"
                        + " recto y deberas bajar hasta casi tocar tus manos "
                        + "con tu pecho.");
        descripcion.add("Realizaremos transiciones de un lado al otro, "
                        + "flexionando un brazo y dejando el otro extendido. "
                        + "Cuanto más separes los piés entre sí, más estable "
                        + "serás y más fácil resultará.");
        int i = (int) Math.floor(Math.random()*3);
        return (String) descripcion.get(i);
    }
    
    @Override
    public void asignarDatosEjercicio(){
        this.nombreEjercicio="Flexiones";
        this.descripcion=escogerEjercicioF();
        this.ejemplo="<a href=\"https://www.youtube.com/watch?v=e_EKkqoHxns\">Ejemplo</a>";
    }
    
}
