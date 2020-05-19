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
public class Perro implements IAccionesAnimal {

    private final String nombre;
    private final String raza;
    private final int Edad;
    private final String Color;

    public Perro() {
        this.Color = "blanco";
        this.Edad = 3;
        this.raza = "maltes";
        this.nombre = "firulais";
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
       return "Estoy comiendo guau";
    }

    @Override
    public String dormir() {
       return "Estoy durmiendo guau";
    }

    @Override
    public String jugar() {
      return  "Estoy jugando guau";
    }
}
