/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g06.e05;

import g06.e05.Banco.Cuenta;
import java.util.Random;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el
 * saldo actual (entero). Las operaciones asociadas a dicha clase son: a)
 * Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés. b) Agregar los métodos getters y setters correspondientes c) Metodo
 * para crear un objeto Cuenta, pidiéndole los datos al usuario. d) Método
 * ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual. e) Método retirar(double retiro): el método
 * recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si
 * la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual
 * en 0. f) Método extraccionRapida(): le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. g) Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. h)
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author Cristian
 */
public class G06E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int opc =0;
        Cuenta cn1 = new Cuenta();
        cn1.crearCuenta(0, 0, 0);
        cn1.setNcuenta(aleatorio.nextInt(99 - 1 + 1));
        System.out.println("Ingrese su DNI");
        cn1.setDni(leer.nextLong());
        System.out.println("Ingrese el monto de su cuenta");
        cn1.setSaldo(leer.nextDouble());
       
        do{
        System.out.println("Que operacion desea hacer:");
        System.out.println("1 - Ingresar saldo");
        System.out.println("2 - Extraccion");
        System.out.println("3 - Extraccion rapida");
        System.out.println("4 - Consultar Saldo");
        System.out.println("5 - Consultar Datos");
            System.out.println("6 u otro - Salir");
         opc = leer.nextInt();

        switch (opc) {

            case 1:
                cn1.ingresarSaldo(cn1.getSaldo(), 0);
                break;
            case 2:
                cn1.retirarSaldo(cn1.getSaldo(), 0);
                break;
            case 3:
                cn1.extraccionRapida(cn1.getSaldo(), 0);
               
                break;
            case 4:
                cn1.consultarSaldo(cn1.getSaldo());
                break;
            case 5:
                cn1.mostrarDatos(cn1.getNcuenta(), cn1.getDni(), cn1.getSaldo());
                break;
        }
        }while (opc <6);
    }

}
