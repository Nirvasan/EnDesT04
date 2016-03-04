/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea04;


public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        int cantidad = 1000; //si no hubiera añadido esta variable, no habría podido ejecutar, ya que la compilación presentaría errores

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        probarRetirar(miCuenta, cantidad);
        probarIngresar(miCuenta, cantidad);
    }

    private static void probarIngresar(CCuenta miCuenta, int cantidad) {
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void probarRetirar(CCuenta miCuenta, int cantidad) {
        try {
            miCuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }
}
