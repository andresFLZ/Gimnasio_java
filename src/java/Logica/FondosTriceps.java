/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author lenovo
 */
public class FondosTriceps extends Ejercicio{
    
    @Override
    public void asignarDatosEjercicio(){
        this.nombreEjercicio="Fondos de tríceps";
        this.descripcion="Para este ejercicio se necesita la ayuda de una silla"
                        + " o un banco. Debes colocar las manos en éste y "
                        + "distanciar los pies para bajar la cadera flexionando"
                        + " los codos. El ejercicio también puede realizarse "
                        + "colocando los pies en otro banco o silla, así se "
                        + "ejercitan mejor los tríceps pero hazlo sólo cuando "
                        + "te veas preparado";
        this.ejemplo="<a href=\"https://www.youtube.com/watch?v=PYapgguXgT8\">Ejemplo</a>";
    }
    
}
