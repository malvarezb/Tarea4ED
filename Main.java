import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        // Asignar un valor a la cantidad
        float cantidad = 2300;  // Este valor puede ser modificado

        // Llamada al método operativa_cuenta
        operativa_cuenta(cuenta1, cantidad);
    }

    // Nuevo método operativa_cuenta
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
