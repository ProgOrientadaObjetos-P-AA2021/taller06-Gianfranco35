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
public class hospital {
    
    
    private String nombre;
    private String direccion;
    private Medico[] conjuntomedico;
    private Enfermero[] conjuntoenfermeros;
    private int especialidades;
    private Ciudad ciudad;
    private double sueldosCancelar;

    public hospital(String nombre, String direccion, int especialidades, Ciudad ciudad, Medico[]mh,Enfermero[]hg) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidades = especialidades;
        this.ciudad = ciudad;
        this.conjuntomedico=mh;
        this.conjuntoenfermeros=hg;
    }

    public void establecerNombreH(String nH) {
        nombre = nH;
    }

    public void establecerCiudadH(Ciudad c) {
        ciudad = c;
    }

    public void establecerNumeroEspecialistas(int nE) {
        especialidades = nE;
    }

    public void establecerConjuntoMedicos(Medico[] cM) {
        conjuntomedico = cM;
    }

    public void establecerConjuntoEnfemeros(Enfermero[] cE) {
        conjuntoenfermeros = cE;
    }

    public void calcularTotalSueldo() {
        double sumaM = 0;
        double sumaE = 0;
        for (int i = 0; i < conjuntomedico.length; i++) {
            sumaM = sumaM + conjuntomedico[i].obtenerSueldoMensual();
        }
        for (int j = 0; j < conjuntoenfermeros.length; j++) {
            sumaE = sumaE + conjuntoenfermeros[j].obtenerSueldoMensual();
        }
        sueldosCancelar = sumaM + sumaE;
    }

    public void establecerDireccionH(String dH) {
        direccion = dH;
    }

    public String obtenerNombreH() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroEspecialistas() {
        return  especialidades;
    }

    public Medico[] obtenerConjuntoMedicos() {
        return  conjuntomedico;
    }

    public Enfermero[] obtenerConjuntoEnfermeros() {
        return conjuntoenfermeros;
    }

    public double obtenerTotalSueldo() {
        return sueldosCancelar;
    }

    public String obtenerDireccionH() {
        return direccion;
    }


    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sHospital: %s\nCiudad: %s\nProvincia: %s\n"
                + "Direccion: %s\nNúmero de especialistas: %d\n"
                + "Listado de médicos\n", cadena, nombre, ciudad.provinciaNombre,
                especialidades);
        for(int i = 0; i < obtenerConjuntoMedicos().length; i++){
            cadena = String.format("%s%s - Sueldo: %.2f - "
                    + "%s\n", cadena, conjuntomedico[i].obtenerNombre(),
                    conjuntomedico[i].obtenerSueldoMensual(),
                    conjuntomedico[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de enfermeros\n", cadena);
        for(int i = 0; i < conjuntoenfermeros.length; i++){
            cadena = String.format("%s%s - Sueldo: %.2f - "
                    + "%s\n", cadena, conjuntoenfermeros[i].obtenerNombre(),
                    conjuntoenfermeros[i].obtenerSueldoMensual(), 
                    conjuntoenfermeros[i].obtenerTipoNombramiento());
        }
        cadena = String.format("%sSueldo: %.2f", cadena, obtenerTotalSueldo());
        
        return cadena;
    }
}
