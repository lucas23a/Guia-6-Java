/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Cristian
 */
public class VectorServicio {
    Scanner leer= new Scanner(System.in);
    Random ale = new Random();
    private int [] vector1= new int[50] ;
    private double [] vector2 = new double [20];
 
 

    public VectorServicio() {
    }

    public VectorServicio(int[] vector1, double[] vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public int[] getVector1() {
        return vector1;
    }

    public double[] getVector2() {
        return vector2;
    }

    public void setVector1(int[] vector1) {
        this.vector1 = vector1;
    }

    public void setVector2(double[] vector2) {
        this.vector2 = vector2;
    }
    
    
    public void llenarVector(){

    
      for (int i =0 ; i < 50 ; i++){
      vector1[i]= ale.nextInt(99-1);
    }
     for (int i =0 ; i < 50 ; i++){
         System.out.print("["+ vector1[i] +"]");
    }
        System.out.println(" ");
     
    }
    
    public void ordenar(){
    Arrays.sort(vector1);
        System.out.println("Primer vector odenado");
        for (int i =0 ; i < 50 ; i++){
         System.out.print("["+ vector1[i] +"]");
    }
        System.out.println(" ");
        
          for (int i =0 ; i < 10 ; i++){
      vector2[i]= vector1[i];
    }
      Arrays.fill(vector2, 10, 20, 0.5);
          System.out.println("Segundo vector");
        for (int i =0 ; i < 20 ; i++){
         System.out.print("["+ vector2[i] +"]");
    }
        System.out.println(" ");
        
        
    }
    
}
