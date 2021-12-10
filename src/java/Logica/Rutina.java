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
public class Rutina {
    
    //Atributos
    protected String repeticiones;
    protected String series;
    
    private ArrayList <Ejercicio> rutina = new ArrayList<>();
    private final ArrayList <Ejercicio> dia1 = new ArrayList<>();
    private final ArrayList <Ejercicio> dia2 = new ArrayList<>();
    private final ArrayList <Ejercicio> dia3 = new ArrayList<>();
    private final ArrayList <Ejercicio> ejerciciosGanarP = new ArrayList<>();
    private final ArrayList <Ejercicio> ejerciciosPerderP = new ArrayList<>();
    private final ArrayList <Ejercicio> ejerciciosTonificar = new ArrayList<>();
    
    
    //setters & getters
    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    public ArrayList<Ejercicio> generarRutina(String objetivo){
    
        //Ejercicios para ganar peso
        ejerciciosGanarP.add(new SentadillasBarra());
        ejerciciosGanarP.add(new Flexiones());
        ejerciciosGanarP.add(new Zancada());
        ejerciciosGanarP.add(new Abdominales());
        ejerciciosGanarP.add(new PlanchaLateral());
        ejerciciosGanarP.add(new RemoHorizontalBarra());
        ejerciciosGanarP.add(new PressMilitar());
        ejerciciosGanarP.add(new PesoMuerto());
        ejerciciosGanarP.add(new Correr());
            
        //Ejercicios para perder peso
        ejerciciosPerderP.add(new Sentadillas());
        ejerciciosPerderP.add(new Flexiones());
        ejerciciosPerderP.add(new Zancada());
        ejerciciosPerderP.add(new Abdominales());
        ejerciciosPerderP.add(new FondosTriceps());
        ejerciciosPerderP.add(new ElevacionesLateralesBrazo());
        ejerciciosPerderP.add(new Dominadas());
        ejerciciosPerderP.add(new SaltarCuerda());
        ejerciciosPerderP.add(new Correr());
            
        //Ejercicios tonificar
        ejerciciosTonificar.add(new Flexiones());
        ejerciciosTonificar.add(new Zancada());
        ejerciciosTonificar.add(new Abdominales());
        ejerciciosTonificar.add(new ElevacionesLateralesBrazo());
        ejerciciosTonificar.add(new PlanchaLateral());
        ejerciciosTonificar.add(new FondosTriceps());
        ejerciciosTonificar.add(new PesoMuerto());
        ejerciciosTonificar.add(new SaltarCuerda());
        ejerciciosTonificar.add(new Correr());
        
        switch (objetivo) {
            case "Subir de peso":
                rutina=ejerciciosGanarP;
                break;
            case "Bajar de peso":
                rutina=ejerciciosPerderP;
                break;
            case "Tonificar":
                rutina=ejerciciosTonificar;
                break;
            default:
                break;
        }
        
        return rutina;
    }
    
    public ArrayList<Ejercicio> asignarDia1(ArrayList<Ejercicio> ejercicios){
        
        dia1.add(ejercicios.get(0));
        dia1.add(ejercicios.get(1));
        dia1.add(ejercicios.get(2));
            
        
        return dia1;
    }
    
    public ArrayList<Ejercicio> asignarDia2(ArrayList<Ejercicio> ejercicios){
        
        dia2.add(ejercicios.get(3));
        dia2.add(ejercicios.get(4));
        dia2.add(ejercicios.get(5));
            
        
        return dia2;
    }
    
    public ArrayList<Ejercicio> asignarDia3(ArrayList<Ejercicio> ejercicios){
        
        dia3.add(ejercicios.get(6));
        dia3.add(ejercicios.get(7));
        dia3.add(ejercicios.get(8));
            
        
        return dia3;
    }
    
}
        

