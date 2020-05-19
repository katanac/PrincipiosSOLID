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
public class PersonaHijoDos extends PersonaPadre implements Ipersona {

    private final String nombre = "Marlon camacho";

    public String getNombre() {
        return nombre;
    }
    
    

    //sobrecarga
    @Override
    public String profesion() {
        return "soy el hijo negado y soy Administrador de empresas";
    }

    @Override
    public String musicaFavorita() {
        return "soy el hijo negado y me gusta el hip hop";
    }

    @Override
    public int numeroFavorito() {
        return 5;
    }
}
