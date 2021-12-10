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
public class Abdominales extends Ejercicio{
    
    public String escogerEjercicioA(){
        ArrayList descripcion = new ArrayList();
        descripcion.add("Estando de pie eleva tus piernas tanto como puedas hacia tu vientre manteniendo el tronco erguido.");
        descripcion.add("Acuestate en el suelo y con la espalda totalmente en el suelo eleva tus piernas hasta formar un "
                        + "ángulo de 90 grados con tu torso");
        descripcion.add("Acuestate en el suelo en posición para hacer un abdominal normal, separa el torso ligeramente del "
                        + "suelo hscia adelante");
        int i = (int) Math.floor(Math.random()*3);
        return (String) descripcion.get(i);
    }
    
    @Override
    public void asignarDatosEjercicio(){
        this.nombreEjercicio="Abdominales";
        this.descripcion=escogerEjercicioA();
        this.ejemplo="<a href=\"https://www.youtube.com/watch?v=CwhxepX7aR8\">Ejemplo</a>";
    }
    
}
