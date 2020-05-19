/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jos.dem.solid.srp;

/**
 *
 * @author Karen.Pena
 */
public class DueñoAnimales {

    private final String nombre;
    private final int Edad;

    public DueñoAnimales() {
        this.Edad = 22;
        this.nombre = "Tatiana Peña";
    }

    //propiedades
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    //propios 
    public void obtenerMascotaGato() {
        Gato gato = new Gato();

        System.out.println("Hola soy el gato mi nombre es " + " " + gato.getNombre() + "tengo "
                + " " + gato.getEdad() + "años, soy de color " + " " + gato.getColor() + " " + "y " + gato.jugar());
    }

    public void obtenerMascotaPerro() {

        Perro perro = new Perro();
        
           System.out.println("Hola soy el perro  mi nombre es " + " " + perro.getNombre() + "tengo "
                + " " + perro.getEdad() + "años, soy de raza " + " " + perro.getRaza()+ " " + "y " + perro.comer());

    }

}
