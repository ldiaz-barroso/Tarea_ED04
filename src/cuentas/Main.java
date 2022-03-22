package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        operativa_cuenta(cuenta1, 200,500, 2.5f);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

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
