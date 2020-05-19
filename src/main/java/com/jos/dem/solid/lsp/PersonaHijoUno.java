/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jos.dem.solid.lsp;

/**
 *
 * @author Karen.Pena
 */
public class PersonaHijoUno extends PersonaPadre implements Ipersona {

    private final String nombre = "Tatiana peña";

    public String getNombre() {
        return nombre;
    }

    public PersonaHijoUno() {
        super();
    }

    
    
    //sobrecarga
    @Override
    public String profesion() {
        return "y  soy ingeniero";
    }

    @Override
    public String musicaFavorita() {
        return "soy el hijo favorito y me gusta el rock";
    }

    @Override
    public int numeroFavorito() {
        return 5;
    }
}
