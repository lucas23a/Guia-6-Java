/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e04;

import g06.e04.rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author Cristian
 */
public class G06E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Rectangulo rec1 = new Rectangulo();
        rec1.crearRectangulo(0, 0);
        System.out.println("Ingrese el valor de la base");
        rec1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rec1.setAltura(leer.nextInt());
        
        System.out.println("La superficie del rectangulo es " + rec1.superficie(rec1.getBase(), rec1.getAltura()));
        System.out.println("El perimetro del rectangulo es " + rec1.perimetro(rec1.getBase(), rec1.getAltura()));
        
        rec1.dibujarRectangulo(rec1.getAltura(), rec1.getBase());
    }
    
}
