/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.persona;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
public boolean mm;
        public double cImc;
        
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(String nombre, int edad, String sexo, double peso, double altura) {
    
      boolean x= false;
      sexo="";
      System.out.println("Nombre de la persona");
        this.nombre = leer.next();
        System.out.println("Edad");
        this.edad = leer.nextInt();
        System.out.println("Sexo - H/ hombre , M/mujer");
        this.sexo = leer.next();
        if((this.sexo.equalsIgnoreCase("h")) || (this.sexo.equalsIgnoreCase("m"))){
            x=true;
        }else{
            System.out.println("Sexo no valido");
        }
        System.out.println("Peso");
        this.peso = leer.nextDouble();
        System.out.println("Altura");
        this.altura = leer.nextDouble();
         
    }

    public double calcularIMC(double peso, double altura,  double cImc) {
        //Cuadno se esta dentro de la misma clase no es necesario agregarle los
        //arg a los parentesis (si se llena en otro lado si)
        double imc = peso / Math.pow(altura, 2);
        cImc= 0;
        if (imc < 20) {
            cImc = cImc -1;
            System.out.println("la persona se encuentra por debajo de su peso");
        } else if ((imc > 19) && (imc < 26)) {
            cImc = 0;
            System.out.println("La persona esta en su peso ideal");
        } else if(imc > 25) {
            cImc=cImc + 1;
            System.out.println("La persona tiene sobrepeso");
        }
        
        return cImc;
        
    }


    public boolean x(int edad) {
      
        if (this.edad > 18) {
            mm = true;
            System.out.println("la persona es mayor");
            
        }else{
            mm=false;
            System.out.println("la persona es menor de edad");
        }
        return mm;
       
    }

}
