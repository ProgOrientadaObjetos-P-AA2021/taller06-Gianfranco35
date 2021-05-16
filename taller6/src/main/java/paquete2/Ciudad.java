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
public class Ciudad {

    String nombre, provinciaNombre;

    public Ciudad(String nombre, String provinciaNombre) {
        this.nombre = nombre;
        this.provinciaNombre = provinciaNombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void estabelcerProvinciaNombre(String provinciaNom) {
        provinciaNombre = provinciaNom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvinciaNombre() {
        return provinciaNombre;
    }

}
