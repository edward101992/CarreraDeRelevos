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
public class Equipo {
    
    private String nombreEquipo;
    private int posicion1;
    private int posicion2;
    private int posicion3;

    public Equipo() {
    }
        
    public Equipo(String nombreEqui) {
        this.nombreEquipo = nombreEqui;
        this.posicion1=0;
        this.posicion2=30;
        this.posicion3=60;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPosicion1() {
        return posicion1;
    }

    public void setPosicion1(int posicion1) {
        this.posicion1 = posicion1;
    }

    public int getPosicion2() {
        return posicion2;
    }

    public void setPosicion2(int posicion2) {
        this.posicion2 = posicion2;
    }

    public int getPosicion3() {
        return posicion3;
    }

    public void setPosicion3(int posicion3) {
        this.posicion3 = posicion3;
    }


       
    public synchronized String imprimirPuesto(){
        String puesto="";    
        puesto = "Equipo : " + nombreEquipo;
        
        for (int i = 0; i <= 100; i++) {
            if (i == posicion1) {
                puesto += "X!";
            } else if (i == posicion2) {
                puesto += "O!";
            } else if (i == posicion3) {
                puesto += "#!";
            } else {
                puesto += "_";
            }
        } 
        return puesto;
    }
}
