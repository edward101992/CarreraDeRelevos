/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carreraderelevos;

/**
 * 
 * @author Edward Ramos
 * @author Victor Preciado
 * esta clase hace la asignacion de las 
 * posiciones de los equipos, e imprime
 * el equipo ganador la sincronizacion de 
 * los hilos y la notificacion.
 */
public class Corredor extends Thread{
    Equipo equipo;
    private String nombreEquipo;
    private int posiciondeInicio;
    private int posiciondeLlegada;
    private String equipo1;
    private String equipo2;
    private String equipo3;

    /**
    * este metodo envia las variables por parametro 
    * @param nombreEquipo nombre del equipo
    * @param posiciondeInicio posisicion de inicio de la carrera
    * @param posiciondeLlegada posicion de de llegada de los competidores
    * @param equipo posicion de los tres equipos
    */
   public Corredor(String nombreEquipo, int posiciondeInicio, int posiciondeLlegada, Equipo equipo ){
        this.nombreEquipo = nombreEquipo;
        this.posiciondeInicio = posiciondeInicio;
        this.posiciondeLlegada = posiciondeLlegada;
        this.equipo = equipo;
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
     * get variable posiciondeInicio
     * @return posiciondeInicio
     */
    public int getPosiciondeInicio() {
        return posiciondeInicio;
    }
    /**
     * set variable posiciondeInicio
     * @param posiciondeInicio 
     */
    public void setPosiciondeInicio(int posiciondeInicio) {
        this.posiciondeInicio = posiciondeInicio;
    }
    /**
     * get variable posiciondeLlegada
     * @return posiciondeLlegada
     */
    public int getPosiciondeLlegada() {
        return posiciondeLlegada;
    }
    /**
     * set variable posiciondeLlegada
     * @param posiciondeLlegada 
     */
    public void setPosiciondeLlegada(int posiciondeLlegada) {
        this.posiciondeLlegada = posiciondeLlegada;
    }
    /**
     * get variable equipo1
     * @return equipo1
     */
    public String getEquipo1() {
        return equipo1;
    }
    /**
     * set variable equipo1
     * @param equipo1 
     */
    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }
    /**
     * get variable equipo2
     * @return equipo2
     */
    public String getEquipo2() {
        return equipo2;
    }
    /**
     * set variable equipo2
     * @param equipo2 
     */
    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }
    /**
     * get variable equipo3
     * @return equipo3
     */
    public String getEquipo3() {
        return equipo3;
    }
    /**
     * set variable equipo3
     * @param equipo3 
     */
    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }
    
     /**
     * este metodo es el encargado 
     * de crear una instancia de Thread 
     * de los corredores, esperar 
     * avanzar y esperar de cada equipo.
     */
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
    /**
     * este metodo esta encargado de hacer que 
     * se sincronicen los hilos y ademas de avanzar
     * y notificarle a los demas su posicion 
     * y le envia la posicion.
     */
    public void avanzaCorredor1(){
        while (true) {
            int posicion = correr(1);
            //analazna la desicion si es ma
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
     /**
     * este metodo esta encargado de hacer que 
     * se sincronicen los hilos y ademas de avanzar
     * y notificarle a los demas su posicion 
     * y le envia la posicion.
     */ 
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

      /**
     * este metodo se encarga del avance de los 
     * equipos y la posicion de cada uno e 
     * imprimir el equipo que ha ganado la 
     * carrera.
     */
    public String avanzaCorredor3(){
        while (true) {
            int posicion = correr(3);
            if (posicion >= 100) {
                equipo.setPosicion3(100);
                if(equipo.getNombreEquipo().equals("Equipo1")){
                    equipo.setNombreEquipo(" °°°Equipo 1°°°");
                }else if(equipo.getNombreEquipo().equals("Equipo2")){
                    equipo.setNombreEquipo("°°°Equipo 2°°°");
                }else if(equipo.getNombreEquipo().equals("Equipo3")){
                    equipo.setNombreEquipo("°°°Equipo 3°°°");
                }
                
                String cadena = "El " + equipo.getNombreEquipo()+" Gana la carrera !!!";
                System.out.println("El equipo ganador es \033[39m'-(°-°)¬_>>" + equipo.getNombreEquipo());
                System.exit(0);
                return cadena;
                
            }
        }
    }
    
     /**
     * este metodo es el encargado de la 
     * sincronizacion y con el wait el hilo se pondra en 
     * espera hasta que sea notificado.
     */
   
    public void esperar(){       
        synchronized (equipo) {           
            try {
                equipo.wait();
            } catch (InterruptedException ex) {
                ex.getMessage();
                System.out.println("Error en Metodo Esperar");
            }
        }
    }
    
     /**
    * este metodo es el encargado de
    * dar el tiempo a los hilos
    * la posicion y el numero 
    * ramdomico y llama al metodo 
    * para mostrar el equipo
    * @param corre
    *  
    */
    public int correr(int corre) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.getMessage();
            System.out.println("Error en el Metodo Correr");
        }
        int numRam = Principal.generaNumero();
        if (corre == 1) {
            equipo.setPosicion1(equipo.getPosicion1()+ numRam);
            mostrarEquipo();
            return equipo.getPosicion1();
        }
        if (corre == 2) {
            equipo.setPosicion2(equipo.getPosicion2()+ numRam);
            mostrarEquipo();
            return equipo.getPosicion2();
        }
        if (corre == 3) {
            equipo.setPosicion3(equipo.getPosicion3()+ numRam);
            mostrarEquipo();
            return equipo.getPosicion3();
        }
        return 0;
    }
     /**
     * este metodo muestra el equipo1 
     * el equipo2 y el equipo3 
     * y comprueba que no se nulo.
     */
    public void mostrarEquipo(){
        
        if(equipo.imprimirPuesto().contains("Equipo1")){
            equipo1 = equipo.imprimirPuesto();
                if(equipo1 != null){
                    System.out.println(equipo1);
                }
        }else if(equipo.imprimirPuesto().contains("Equipo2")){
            equipo2=equipo.imprimirPuesto();
                if(equipo2 != null){
                    System.out.println(equipo2);
                }
        }else if(equipo.imprimirPuesto().contains("Equipo3")){
            equipo3=equipo.imprimirPuesto();
                 if(equipo3 != null){
                     System.out.println(equipo3);
                   }
             }
        
      }
 }
    
