/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e11;

import java.util.Date;
import java.util.Scanner;

/**
 *Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 * @author Cristian
 */
public class G06E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese dia");
        int dia= leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese año");
        int year= leer.nextInt();
        Date fecha = new Date (year-1900, mes-1, dia);
Date fechaActual = new Date();        

        System.out.println(fecha.toString());
        System.out.println(fechaActual);
        
        int antiguedad = fechaActual.getYear() - fecha.getYear();
        System.out.println(antiguedad);
    }
    
}
