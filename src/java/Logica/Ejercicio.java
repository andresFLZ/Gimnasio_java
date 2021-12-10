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
public class Ejercicio extends Rutina{
    
    //Atributos
    protected String nombreEjercicio;
    protected String descripcion;
    protected String ejemplo;
    
    //getters & setters
    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }
    
    
    public void asignarUsoEjercicios(String diasLibres){
    
        if(diasLibres.equals("De 1 a 3")){
            this.repeticiones="20";
            this.series="5";
        }
        else if(diasLibres.equals("De 3 a 5")){
            this.repeticiones="15";
            this.series="4";
        }
        
    }
    
    public void asignarDatosEjercicio(){}
    
}
