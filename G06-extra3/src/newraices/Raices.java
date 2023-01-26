/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newraices;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Raices {
    Scanner leer = new Scanner(System.in);
    private int a ;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void valores(){
    System.out.println("Ingrese valor de 'a'");
    a= leer.nextInt();
       System.out.println("Ingrese valor de 'b'");
      b=leer.nextInt();
       System.out.println("Ingrese valor de 'c'");
    c= leer.nextInt();
    
    }
    
    public double getDiscriminanted(){
    double dis= Math.pow(b, 2)- (4*(a*c));
    return dis;
    }
    
    public boolean tieneRaices(){
    boolean x;
    if (getDiscriminanted() >0){
    x = true;
    }else{
    x= false;
    }
    return x;
    }
    
     public boolean tieneRaiz(){
    boolean y;
    if (getDiscriminanted()== 0){
    y = true;
    }else{
    y= false;
    }
    return y;
    }
    
    
    public void obtenerRaices(){
    if (tieneRaices() == true){
    double r = (Math.pow(b,2))- (4*a*c);
    double re = (-b)+ Math.sqrt(r);
    double solucion1= re/ (2*a);
    
    double res= (-b)- Math.sqrt(r);
    double solucion2= res/ (2*a);
    
        System.out.println("Las posibles soluciones son: " + solucion1 + " y " + solucion2);      
    }
    
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaiz(){
    if (tieneRaiz()== true){
    double tot = (Math.pow(b,2))- (4*a*c);
    double total = (-b)+ Math.sqrt(tot);
    double solucion3= total/ (2*a);
    
        System.out.println("La solucion es: "+ solucion3);
    }
    }
    
    public void calcular(){
    tieneRaices();
    tieneRaiz();
    obtenerRaices();
    obtenerRaiz();
    
    if ((tieneRaices()==false) && ( tieneRaiz()== false)){
        System.out.println("No hay solucion");
    
    }
    }
    
    
    
}
