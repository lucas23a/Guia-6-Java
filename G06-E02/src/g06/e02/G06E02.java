/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e02;

import g06.e02.circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 * @author Cristian
 */
public class G06E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circunferencia circulo = new Circunferencia();
       
        System.out.println("Ingrese el radio del cirulo");
        circulo.setRadio(leer.nextDouble());
        
        circulo.area();
        circulo.perimetro();
        
        
    }
    
}
