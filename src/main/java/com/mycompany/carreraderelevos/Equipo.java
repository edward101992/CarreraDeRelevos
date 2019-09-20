/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carreraderelevos;


import static java.lang.System.out;

/**
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Equipo {
     /**
     * variable nombreEquipo es la encargada de asignar 
     * el nombre del equipo.
     * variable posicion1 es la encargada de la posicion
     * del equipo numero uno del equipo azul.
     * variable posicion2 es la encargada de la posicion
     * del equipo numero dos del equipo verde.
     * variable posicion3 es la encargada de la posicion
     * del equipo numero tres del equipo rojo.
     */
    private String nombreEquipo;
    private int posicion1;
    private int posicion2;
    private int posicion3;
    
    /**
     * Constructor clase Equipo
     */
    public Equipo() {
    }
    /**
     * Este metodo es el encargado de apuntar o acceder a
     * los metodos asociados de nombre del equipo 
     * y las posiciones de los tres equipos.
     */   
    public Equipo(String nombreEqui) {
        this.nombreEquipo = nombreEqui;
        this.posicion1=0;
        this.posicion2=30;
        this.posicion3=60;
    }
    /**
     * get variable nombreEquipo
     * @return nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    /**
     * set variable nombreEquipo
     * @param nombreEquipo 
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    /**
     * get variables posicion1
     * @return posicion1
     */
    public int getPosicion1() {
        return posicion1;
    }
    /**
     * set variable posicion1
     * @param posicion1 
     */
    public void setPosicion1(int posicion1) {
        this.posicion1 = posicion1;
    }
    /**
     * get variable posicion2
     * @return posicion2
     */
    public int getPosicion2() {
        return posicion2;
    }
    /**
     * set variable posicion2
     * @param posicion2 
     */
    public void setPosicion2(int posicion2) {
        this.posicion2 = posicion2;
    }
    /**
     * get variable posicion3
     * @return posicion3
     */
    public int getPosicion3() {
        return posicion3;
    }
    /**
     * set variable posicion3
     * @param posicion3 
     */
    public void setPosicion3(int posicion3) {
        this.posicion3 = posicion3;
    }


    /**
     * este metodo es el encargado de imprimir 
     * los puestos de los competidores 
     * y comprobar la posicion y el nombre del
     * equipo.
     */
    public synchronized String imprimirPuesto()  {
        /**
         * varible puesto es la encargada de 
         * imprimir el puesto de los competidores.
         */
        String puesto="";  
       
        
        puesto = "Equipo : " + nombreEquipo;        
        for (int i = 0; i <= 100; i++) {
       
            if (i == posicion1) {            
                puesto += "\033[34m|(*-*)|";
            } else if (i == posicion2) {              
                puesto += "\033[32m|(°O°)|";  
            } else if (i == posicion3) {               
                puesto += "\033[31m|('-')|"; 
            } else {
                puesto += "_\033[30m";              
                
            }
           
        }
         
        borrar();
        return puesto; 
         
    }   
    /**
     * este metodo es el encargado de ir
     * borrando las impresiones de cada
     * relevo.
     */
    public void borrar(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
       
       
    }
}

