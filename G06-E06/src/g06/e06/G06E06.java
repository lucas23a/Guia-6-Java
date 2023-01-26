/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e06;

import g06.e06.nesspreso.Cafetera;
import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 * @author Cristian
 */
public class G06E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Cafetera orden= new Cafetera();
        int opc ;
        System.out.println("Cual es la cantidad actual de cafe?");
        orden.setCantActual(leer.nextInt());
        
        do {
        System.out.println("Que va a relizar:");
        System.out.println("1 - LLenar cafetera");
        System.out.println("2 - Servir taza");
        System.out.println("3 - Vaciar cafetera");
        System.out.println("4 - Agregar cafe");
        System.out.println("5 - Salir");
         opc = leer.nextInt();
        
        switch (opc){
            case 1: 
                orden.llenarCafetera(orden.getCantActual(), orden.getCapacidadMax());
            break;
            case 2:
                orden.servirTaza(orden.getCantActual());
                break;
            case 3 :
                orden.vaciarCafetera(orden.getCantActual());
                break;
            case 4 :
                orden.agregarCafe(orden.getCantActual(), orden.getCapacidadMax());
            break;
            case 5:
                System.out.println("Hasta luego");
                break;
            default : 
                System.out.println("Opcion no valida");
        break;
        }
        }while (opc != 5);
        
        
    }
    
}
