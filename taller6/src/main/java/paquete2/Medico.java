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
public class Medico {
    
    private String nombre, especialidad;
    private double sueldoMensual;

    public Medico(String nombre, String especialidad, double sueldoMensual) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldoMensual;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void estabelcerEspecialidad(String especi) {
        especialidad = especi;
    }

    public void estabelcerSueldoMensual(double sueldoMen) {
        sueldoMensual = sueldoMen;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return " - " + nombre + " - especialidad: " + especialidad
                + " - sueldo: " + sueldoMensual + "\n";
    }
}
