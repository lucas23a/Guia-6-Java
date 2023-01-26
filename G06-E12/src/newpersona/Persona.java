/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpersona;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Persona {
    private String nombre;
     private String apellido;
    private int dia;
    private int mes;
    private int año;
    Scanner leer = new Scanner (System.in);
    private Date fecha = new Date(año-1900, mes-1, dia);

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dia, int mes, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    

    public void crearPersona(){
        System.out.println("Nombre;");
    nombre= leer.next();
        System.out.println("Apellido:");
    apellido= leer.next();
        System.out.println("Dia de nacimiento");
    dia= leer.nextInt();
        System.out.println("Mes de nacimiento");
    mes= leer.nextInt();
        System.out.println("Año de nacimiento");
    año= leer.nextInt();
    Date fecha;
    }
    
    public void calcularEdad(){
    Date hoy = new Date();
    int edad =hoy.getYear()- fecha.getYear();
        System.out.println(edad);
    }   
    
    public void menorQue(){
        System.out.println("Nombre de la otra persona");
   String nom= leer.next();
        System.out.println("Dia de nacimiento");
int d = leer.nextInt();
        System.out.println("Mes de nacimiento");
  int m = leer.nextInt();
        System.out.println("Año de nacimiento");
    int a = leer.nextInt();
    
    Date fecha2 = new Date(a-1900,m-1,d);
   boolean mom;
   if (fecha2.getDate()< fecha.getDate()){
   mom= true;
   }else{
   mom= false;
   }
        System.out.println(nom + " es menor que " + nombre+ "? " + mom);
    
    }
    
    public void mostrarPersona(){
        System.out.println(nombre + " " + apellido);
        System.out.println(fecha.toString());
        
        
    }

    
    
    
    
        
}
