/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.servicio;

import java.util.Random;
import math.Matematica;

/**
 *
 * @author Cristian
 */
public class MathService {
    
    Random ale= new Random();
Matematica op1 = new Matematica();

     public Matematica definirNumeros(){
       
     op1.setNum1((int)(ale.nextGaussian()*100));
     op1.setNum2((int)(ale.nextGaussian()*100));
     return op1;
     }
    
    public void devolverMayor(Matematica num1, Matematica num2){
    if(op1.getNum1() > op1.getNum2()){
        System.out.println("El primer numero ingreado : " + op1.getNum1() + ", es el mayot");
    }else{
    System.out.println("El segundo numero ingreado : " + op1.getNum2() + ", es el mayot");
    }   
    } 
    
    public void calcularPotencia (Matematica num1, Matematica num2){
       double resultado;
       Math.round(op1.getNum1());
       Math.round(op1.getNum2());
     if(op1.getNum1() > op1.getNum2()){
     resultado= Math.pow(op1.getNum1(), op1.getNum2());
         
     }else{
      resultado= Math.pow(op1.getNum2(), op1.getNum1());
     }
    Math.round(resultado);
        System.out.println("El resultado de la potencia es " + resultado);
    
    }
    
  public void calcularRaiz(Matematica num1, Matematica num2){
  Math.abs(op1.getNum1());
  Math.abs(op1.getNum2());
  double raiz;
   if(op1.getNum1() > op1.getNum2()){
   
         raiz = Math.sqrt(op1.getNum2());
         System.out.println("El resultado de la raiz del segundo numero es " + raiz);
     }else{
      raiz = Math.sqrt(op1.getNum1());
      System.out.println("El resultado de la raiz del primer numero es " + raiz);
     }
   
  
  
  }
    
}
