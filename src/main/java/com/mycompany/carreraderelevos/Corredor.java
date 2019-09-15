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
public class Corredor extends Thread{
    Equipo equipo;
    private String nombreEquipo;
    private int posiciondeInicio;
    private int posiciondeLlegada;
    private String equipo1;
    private String equipo2;
    private String equipo3;

    public Corredor() {
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPosiciondeInicio() {
        return posiciondeInicio;
    }

    public void setPosiciondeInicio(int posiciondeInicio) {
        this.posiciondeInicio = posiciondeInicio;
    }

    public int getPosiciondeLlegada() {
        return posiciondeLlegada;
    }

    public void setPosiciondeLlegada(int posiciondeLlegada) {
        this.posiciondeLlegada = posiciondeLlegada;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }
    
    
    @Override
 
    public void run(){
        if(posiciondeInicio == 0){
           avanzaCorredor1(); 
        }else{
            esperar();
        }if(posiciondeInicio==30){
           avanzaCorredor2();    
        }else{
            esperar();
        }if(posiciondeInicio==60){
            avanzaCorredor3();
        }else{
            esperar();
        }
    }
    
        public void avanzaCorredor1(){
        while (true) {
            int posicion = correr(1);
            if (posicion >= 30) {
                equipo.setPosicion1(30);
                synchronized (equipo) {
                    equipo.notifyAll();
                    posiciondeInicio = 30;
                }
                break;
            }
        }
    }
        
    public void avanzaCorredor2(){
        while (true) {
            int posicion = correr(2);
            if (posicion >= 60) {
                equipo.setPosicion2(60);
                synchronized (equipo) {
                    equipo.notify();
                }
                break;
            }
        }
    }
    
 }
    
