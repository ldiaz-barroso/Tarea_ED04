package cuentas;

/**
 * @author Lara Díaz
 * @version 1.0
 */
public class Main {

     /**
      * Método principal
      * @param args tipo String[] 
      */
    
    public static void main(String[] args) {
        /**
         * Declaramos las variables
         */

        CCuenta cuenta1;
        double saldoActual;

        /**
         * Inicializamos la variable cuenta1
         */
        
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        /**
         * @see estado
         */
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        /**
         * Llamamos al método operativa_cuenta
         * @see operativa_cuenta
         */
        
        operativa_cuenta(cuenta1, 200, 500, 2.5f);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Este metodo se usa para retirar dinero de la cuenta y posteriormente
     * ingresar otro monto
     *
     * @param cuenta1 tipo CCuenta
     * @param cantidadRetirar tipo double
     * @param cantidadIngresar tipo double
     * @param cantidad tipo float
     */
    public static void operativa_cuenta(CCuenta cuenta1, double cantidadRetirar, double cantidadIngresar, float cantidad) {
        try {
            cuenta1.retirar(cantidadRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidadIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
