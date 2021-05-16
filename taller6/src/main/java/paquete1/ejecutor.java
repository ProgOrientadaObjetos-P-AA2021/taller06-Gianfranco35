/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

import java.util.Scanner;
import paquete2.Ciudad;
import paquete2.Enfermero;
import paquete2.Medico;
import paquete2.hospital;
/**
 *
 * @author micha
 */
public class ejecutor {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del hospital");
        String nombreH = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        String nombreCiudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        String provincia = entrada.nextLine();
        System.out.println("Ingrese la direccion del hospital");
        String direccion = entrada.nextLine();
        Ciudad ciudad = new Ciudad(nombreCiudad, provincia);
        System.out.println("Ingrese el numero de especialistas");
        int especialistas = entrada.nextInt();
        int i;
        System.out.println("Ingrese el numero de doctes que hay");
        int nM = entrada.nextInt();
        String nombreD;
        String especialidad;
        double sueldoD;
        Medico[] medico;
        medico = new Medico[nM];
        for (i = 0; i < nM; i++) {
            entrada.nextLine();
            System.out.printf("Datos del %d doctor\n", i + 1);
            System.out.println("Nombre");
            nombreD = entrada.nextLine();
            System.out.println("Especialidad");
            especialidad = entrada.nextLine();
            System.out.println("Sueldo");
            sueldoD = entrada.nextDouble();
            Medico medic = new Medico(nombreD, especialidad, sueldoD);
            medico[i] = medic;
        }
        System.out.println("Ingrese el numero de enfermeros");
        int nE = entrada.nextInt();
        String nombreE;
        String tipo;
        double sueldoE;
        Enfermero[] enfermero;
        enfermero = new Enfermero[nE];
        for(i = 0; i < nE; i++){
            entrada.nextLine();
            System.out.printf("Datos del %d enfermero\n", i+1);
            System.out.println("Nombre");
            nombreE = entrada.nextLine();
            System.out.println("Tipo");
            tipo = entrada.nextLine();
            System.out.println("Sueldo");
            sueldoE = entrada.nextDouble();
            Enfermero enfer = new Enfermero(nombreE, tipo, sueldoE);
            enfermero[i] = enfer;
        }
        hospital hospital1 = new hospital(nombreH ,direccion,especialistas, ciudad , medico, enfermero);
        hospital1.calcularTotalSueldo();
        System.out.printf("%s", hospital1);
    }
}
