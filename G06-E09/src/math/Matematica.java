/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author Cristian
 */
public class Matematica {
    private int num1;
    private int num2;

    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
      public void definirNumeros(){
       this.num1 = num1;
        this.num2 = num2;
    
     }
    
    public void devolverMayor(int num1, int num2){
    if(num1> num2){
        System.out.println("El primer numero ingreado : " + num1 + ", es el mayot");
    }else{
    System.out.println("El segundo numero ingreado : " + num2 + ", es el mayot");
    }   
    } 
    
    public void calcularPotencia (int num1, int num2){
       double resultado;
       Math.round(num1);
       Math.round(num2);
     if(num1 > num2){
     resultado= Math.pow(num1, num2);
         
     }else{
      resultado= Math.pow(num2, num1);
     }
    Math.round(resultado);
        System.out.println("El resultado de la potencia es " + resultado);
    
    }
    
  public void calcularRaiz(int num1, int num2){
  Math.abs(num1);
  Math.abs(num2);
  double raiz;
   if(num1 > num2){
   
         raiz = Math.sqrt(num2);
         System.out.println("El resultado de la raiz del segundo numero es " + raiz);
     }else{
      raiz = Math.sqrt(num1);
      System.out.println("El resultado de la raiz del primer numero es " + raiz);
     }
 
    
    
}
}