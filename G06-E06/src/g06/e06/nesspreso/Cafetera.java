/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e06.nesspreso;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Cafetera {
    Scanner leer = new Scanner (System.in);
    private int capacidadMax = 1000;
    private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantActual) {
        this.capacidadMax = capacidadMax;
        this.cantActual = cantActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    public void llenarCafetera (int cantActual, int capacidadMax){
    cantActual= capacidadMax;
        System.out.println("Se lleno la cafetera. la cantidad actual es " + cantActual );
    }
    public int servirTaza(int cantActual){
        System.out.println("Cual es la capacidad de la taza");
    int taza= leer.nextInt();
    int resto= cantActual;
    cantActual -= taza; 
    if (taza> cantActual){
    cantActual= 0;
        System.out.println("La taza se lleno con " + resto);
    }
    return taza;
    }
    
    public void vaciarCafetera (int cantActual){
    cantActual= leer.nextInt();
        System.out.println("Se vacio la cafetera, la cantidad actual es " + cantActual);
    }
    
    public void agregarCafe (int cantActual, int capacidadMax){
        System.out.println("Cuanto cafe desea agregar");
    int agregarCafe=leer.nextInt();
    cantActual= agregarCafe + cantActual;
    if (cantActual > capacidadMax){
        System.out.println("La cantidad agregada supera la capacidad maxima");
    }
    
    }
    
}
