
package tarea04;
/**
 * 
 * @author jacob cabrera velada
 * @version  1.0.6
 */

public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private final String ERRORCANTIDADNEGATIVA ="No se puede ingresar una cantidad negativa";

    /**
     * Método constructor para crear objetos CCuetna, pero sin parámetros
     * @since 1.0.0
     */

    public CCuenta()
    {
    }

    /**
     * Método constructor para crear objetos CCuetna, pero con parámetros
     * @param nom de tipo String para almacenar el nombre del titular de cuenta
     * @param cue de tipo String, que almacena el número de cuenta
     * @param sal de tipo double, que contiene el saldo de la cuenta
     * @param tipo de tipo double, que guarda el tipo de interés a aplicar
     * @since 1.0.0
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método asignarNombre usado para actualizar el atributo nombre
     * @param nom de tipo String para almacenar el nombre del titular de cuenta
     * @since 1.0.0
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
     /**
     * Método obtenerNombre usado para recuperar el atributo nombre
     * @return nombre, de tipo String
     * @since 1.0.0
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método estado usado para recuperar el valor del atributo saldo
     * @return lo que devuelva la invocación del método getSaldo()
     * @since 1.0.0
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método ingresar. Incrementa el valor de saldo tantas unidades como indique el parámetro cantidad
     * @param cantidad es una variable de tipo double
     * @since 1.0.0
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método retirar. Disminuye el valor de saldo tantas unidades como indique el parámetro cantidad
     * @param cantidad es una variable de tipo double
     * @since 1.0.0
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método obtenerCuenta(). Recuperar el valor o String almacenado en la variable cuenta
     * @return el valor devuelto al invocar al método getCuenta(), que será un String
     * @since 1.0.0
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método getNombre(). Recupera el contenido de la variable nombre. Encapsula el atributo nombre
     * @return nombre de tipo String 
     * @since 1.0.5
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre(). Actualizar el contenido de nombre, por medio del parámetro
     * @param nombre es una variable de tipo String
     * @return void. No devuelve, sólo actualzia
     * @since 1.0.5
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getTipoInteres(). Recupera el contenido de la variable tipoInteres. Encapsula el atributo tipoInterés
     * @return tipoInterés de tipo double
     * @since 1.0.5
     */
    private double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setTipoInterés(). Actualizar el contenido de la variable tipoInterés, por medio del parámetro tipoInterés
     * @param nombre es una variable de tipo String
     * @return void. No devuelve, sólo actualzia
     * @since 1.0.5
     */
    private void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    

    /**
     * Método getCuenta(). Obtener el contenido de la variable cuenta. Encapsula el contenido de la variable cuenta
     * @return cuenta
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * Método setCuenta(). Actualiza o establece el valor de la variable cuenta, y encapsula su contenido
     * @param cuenta the cuenta to set. Tipo String
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getSaldo(). Obtener el contenido de la variable de ejemplar saldo. Encapsula el contido de dicha variable
     * @return the saldo
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * Método setCuenta(). Actualiza o establece el valor de la variable cuenta, y encapsula su contenido
     * @param saldo  establecer el saldo. Tipo String
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
