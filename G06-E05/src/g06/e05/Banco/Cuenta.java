/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e05.Banco;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Cuenta {
Scanner leer = new Scanner (System.in);
    private int ncuenta;
    private long dni;
    private double saldo;
    private double ingresar;
    private double retirar;

    public Cuenta() {
    }

    public Cuenta(int ncuenta, long dni, double saldo, double ingresar) {
        this.ncuenta = ncuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.ingresar = ingresar;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public double getIngresar() {
        return ingresar;
    }

    public double getRetirar() {
        return retirar;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setIngresar(double ingresar) {
        this.ingresar = ingresar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void crearCuenta(int ncuenta, long dni, double saldo) {
        this.ncuenta = ncuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public double ingresarSaldo(double saldo, double ingresar) {
        System.out.println("Que monto desea ingresar");
        ingresar= leer.nextDouble();
        double isaldo = ingresar + saldo;
        System.out.println("El monto de su cuenta es $" + isaldo);
        return isaldo;
       
    }

    public double retirarSaldo(double saldo, double retirar) {
         System.out.println("Cuanto va a retirar?");
         retirar= leer.nextDouble();
        double rsaldo = saldo - retirar;
        if (retirar > saldo) {
            rsaldo = 0;
        }
        System.out.println("Su saldo disponible es " + rsaldo);
        return rsaldo;
    }

    public void extraccionRapida(double saldo, double retirar) {
        System.out.println("Cuanto dinero va a retirar?");
        retirar = leer.nextDouble();
        double ersaldo= saldo;
        if (retirar > (saldo * 0.20)) {
            System.out.println("No se puede retirar mas del 20%");
        } else {
         ersaldo = saldo - retirar;
                   System.out.println("Saldo acutal $" + ersaldo);
        }        
     
    }
    
    public void consultarSaldo( double saldo){
        System.out.println("Su saldo disponible es de $" + saldo);
    }
   public void mostrarDatos (int ncuenta, long dni , double saldo){
       System.out.println("Nro de cuenta " + ncuenta);
       System.out.println("DNI del titular " + dni);
       System.out.println("Saldo actual $" + saldo );
   }
}
