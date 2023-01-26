/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e04.rectangulo;

/**
 *
 * @author Cristian
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int superficie(int base, int altura) {
        int superficie = base * altura;
        return superficie;
    }

    public int perimetro(int base, int altura) {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujarRectangulo(int base, int altura){
    
        for (int i = 0; i < base ; i++){
            
        for (int j = 0 ; j < altura ; j++){
            System.out.print("*");
        }
            System.out.println(" ");
        }
       
        
        
    }
}
