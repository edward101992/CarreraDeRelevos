/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carreraderelevos;

/**
 *
 * @author SuperUs
 */
public class Principal {
    
    public static int generaNumero(){    
        int numero = (int) (Math.random() * 3) + 1;
        return numero;
    }
    
    public void prepararEquipo(){
    
        Equipo equi1 =  new Equipo("Equipo1");
        
        Corredor corredor11 = new Corredor("Corredor11", 0, 30, equi1); 
        Corredor corredor12 = new Corredor("Corredor12", 30, 60, equi1);
        Corredor corredor13 = new Corredor("Corredor13", 60, 100, equi1);
        corredor11.start();
        corredor12.start();
        corredor13.start();
    }
    
    public void inicioCarrera(){
    
    
    }
    
    
}
