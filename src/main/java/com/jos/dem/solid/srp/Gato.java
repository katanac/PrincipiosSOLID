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
public class Gato implements IAccionesAnimal {

    private final String nombre;
    private final String raza;
    private final int Edad;
    private final String Color;

    public Gato() {
        this.Color = "gris";
        this.Edad = 2;
        this.raza = "siames";
        this.nombre = "neko";
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return Edad;
    }

    public String getColor() {
        return Color;
    }

    //sobrecarga
    @Override
    public String comer() {
     return "Estoy comiendo miau";
    }

    @Override
    public String dormir() {
      return  "Estoy durmiendo miau";
    }

    @Override
    public String jugar() {
       return "Estoy jugando miau";
    }

}
