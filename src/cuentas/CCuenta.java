package cuentas;

/**
* @author  Lara Díaz
* @version 1.0
*/

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto para CCuenta
     */
    public CCuenta()
    {
    }

     /**
      * Constructor con los atributos nombre, cuenta, saldo y tipo de interés
      * @param nom tipo String
      * @param cue tipo String
      * @param sal tipo double
      * @param tipo tipo double
      */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return saldo, utilizando getSaldo  
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero, donde al saldo actual (getSaldo) se le suma la cantidad a ingresar
     * @param cantidad de tipo double
     * @throws Exception no se podrá ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero, donde al saldo actual (getSaldo) se le resta la cantidad que se desea retirar
     * @param cantidad de tipo double
     * @throws Exception no se podrá retirar una cantidad negativa y no se podrá retirar si el saldo actual es menor a la cantidad a retirar
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
