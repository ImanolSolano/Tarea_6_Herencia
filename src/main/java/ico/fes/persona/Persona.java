/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.persona;

/**
 *
 * @author Imanol Solano
 */
public class Persona {
    private String nombre;
    private int edad;
    private int genero;
    private double altura; 

public static final int GENERO_MASCULINO = 0;
public static final int GENERO_FEMENINO = 1;
    
    public Persona() {
    }

    public Persona(String nombre, int edad, int genero, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n edad=" + edad + "\n genero=" + genero + "\n altura=" + altura + '}';
    }
    
    
}
