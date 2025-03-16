package cuentas;

/**
 * Clase principal de una cuenta bancaria.
 * Contiene el método `main` y la función `operativa_cuenta` que 
 * realiza operaciones sobre una cuenta.
 * 
 * @author Angel Vazquez Ferro
 * @version 1.0
 */
public class Main {

    /**
     * Método main llama al método `operativa_cuenta` con un valor inicial.
     * 
     * @param args Argumentos.
     */
    public static void main(String[] args) {
        operativa_cuenta(25.00f);
    }

    /**
     * Realiza operaciones sobre una cuenta bancaria, incluyendo consulta de saldo,
     * retiro de dinero e ingreso de fondos.
     * 
     * @param cantidad cantidad utilizada en la operación.
     */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
