package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones de depósito y retiro.
 * Permite gestionar el saldo y consultar su estado.
 * 
 * @author Angel Vazquez Ferro
 * @version 1.0
 */
public class CCuenta {

	/** Nombre del titular de la cuenta. */
	private String nombre;
	/** Número de cuenta bancaria. */
    private String cuenta;
    /** Saldo disponible en la cuenta. */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta.
     * 
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de cuenta bancaria.
     * @param sal  Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo disponible en la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad a la cuenta.
     * 
     * @param cantidad Cantidad a depositar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de la cuenta si hay saldo suficiente.
     * 
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nuevo nombre del titular.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Obtiene el número de cuenta bancaria.
     * 
     * @return Número de cuenta.
     */
	public String getCuenta() {
		return cuenta;
	}

    /**
     * Establece el número de cuenta bancaria.
     * 
     * @param cuenta Nuevo número de cuenta.
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo disponible.
     */
	public double getSaldo() {
		return saldo;
	}

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo de la cuenta.
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     * 
     * @return Tipo de interés.
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     * 
     * @param tipoInteres Nuevo tipo de interés.
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
