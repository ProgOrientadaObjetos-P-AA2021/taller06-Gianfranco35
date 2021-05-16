 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author micha
 */
public class Enfermero {

    private String nombre, tipoNombramiento;
    private double sueldoMensual;

    public Enfermero(String nombre, String tipoNombramiento, double sueldoMensual) {
        this.nombre = nombre;
        this.tipoNombramiento = tipoNombramiento;
        this.sueldoMensual = sueldoMensual;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerTipoNombramiento(String tipoNombra) {
       tipoNombramiento = tipoNombra;
    }

    public void estabelcerSueldoMensual(double sueldoMen) {
        sueldoMensual = sueldoMen;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoNombramiento() {
        return tipoNombramiento;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    @Override

    public String toString() {
        return " - " + nombre + " - nombramiento: " + tipoNombramiento
                + " - sueldo: " + sueldoMensual + "\n";
    }
}
