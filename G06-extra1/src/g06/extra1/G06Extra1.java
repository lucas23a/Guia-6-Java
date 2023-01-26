/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.extra1;

import java.util.Scanner;
import newcancion.Cancion;

/**
 *
 * @author Cristian
 */
public class G06Extra1 {

    /**
     * 1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion track = new Cancion();
        System.out.println("interprete");
        track.setAutor(leer.next());
        System.out.println("Cancion");
        track.setTitulo(leer.next());
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
