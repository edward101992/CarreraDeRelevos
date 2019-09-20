/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carreraderelevos;

/**
 * Clase Inicio donde se declaran los equipos y sus corredores
 * y se pone en marcha los Threads.
 * @author Edward Ramos
 * @author Victor Preciado
 */

public class Principal {
     
      
    private int cont;
    Equipo equi1 =  new Equipo("Equipo1");
    Equipo equi2 =  new Equipo("Equipo2");
    Equipo equi3 =  new Equipo("Equipo3");   
    Corredor corredor11 = new Corredor("Corredor11", 0, 30, equi1);
    Corredor corredor12 = new Corredor("Corredor12", 30, 60, equi1);
    Corredor corredor13 = new Corredor("Corredor13", 60, 100, equi1);
    Corredor corredor21 = new Corredor("Corredor21", 0, 30, equi2);
    Corredor corredor22 = new Corredor("Corredor22", 30, 60, equi2);
    Corredor corredor23 = new Corredor("Corredor23", 60, 100, equi2);
    Corredor corredor31 = new Corredor("Corredor31", 0, 30, equi3);
    Corredor corredor32 = new Corredor("Corredor32", 30, 60, equi3);
    Corredor corredor33 = new Corredor("Corredor33", 60, 100, equi3);
    
    /**
     * Funcion que simula el movimiento de los corredores
     */
    public static void simular(){            
        System.out.println("\n");
        System.out.println("\n");
    }
    /**
     * este metodo esta encargado de generar un numero 
     * ramdomico para los equipos
     * @return numero;
     */
    public static int generaNumero(){
       // simular();
        int numero = (int) (Math.random() * 3) + 1;
      //  simular();
        return numero;
        
    }
     /**
     * este metodo esta encargado de dar comienzo 
     * a los hilos 
     */
     public void carrera(){
        corredor11.start();
        corredor12.start();
        corredor13.start();
        corredor21.start();
        corredor22.start();
        corredor23.start();
        corredor31.start();
        corredor32.start();
        corredor33.start();
    }
}
