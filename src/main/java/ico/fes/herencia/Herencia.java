/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

import ico.fes.alumno.Alumno;
import ico.fes.persona.Persona;

/**
 *
 * @author Imanol Solano
 */
public class Herencia {
    public static void main(String[] args) {
        Alumno A1 = new Alumno("098765432", "ICO", 2, "Ima", 19, Persona.GENERO_MASCULINO, 1.75);
        Alumno A2 = new Alumno();
        System.out.println("Los datos del alumn@ son: " + A1);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        
        A2.setNombre("Fernanda");
        A2.setEdad(22);
        A2.setGenero(Persona.GENERO_FEMENINO);
        A2.setAltura(1.5);
        A2.setNumCuenta("124365879");
        A2.setCarrera("Diseño y comunicación visual");
        A2.setSemestre(6);
        System.out.println("Los datos del alumn@ son: " + A2);
        
    }
}
