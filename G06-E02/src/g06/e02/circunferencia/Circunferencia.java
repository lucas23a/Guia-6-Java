/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e02.circunferencia;

/**
 *
 * @author Cristian
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio= radio;
    }
    
    public void area(){
        double area= Math.PI* (Math.pow(radio,2));
        
        System.out.println("El area de la circunferencia es " + area);
    }
    public void perimetro(){
    double perimetro = 2* Math.PI * radio;
        System.out.println("El perimetro del area es " + perimetro);
    }
    
}
