public class Main {
    public static void main(String[] args) {
        // Crear una cuenta de ahorros con número "001" y una tasa de interés del 5%
        CuentaAhorros cuentaAhorros = new CuentaAhorros("001", 0.05);
        cuentaAhorros.consignar(1000.0);
        System.out.println("Saldo en Cuenta Ahorros: " + cuentaAhorros.consultarSaldo());
        System.out.println("Intereses en Cuenta Ahorros: " + cuentaAhorros.calcularIntereses());

        // Retirar dinero de la cuenta de ahorros
        boolean exitoRetiro = cuentaAhorros.retirar(200.0);
        if (exitoRetiro) {
            System.out.println("Retiro exitoso. Nuevo saldo en Cuenta Ahorros: " + cuentaAhorros.consultarSaldo());
        } else {
            System.out.println("Retiro fallido. Fondos insuficientes.");
        }

        // Crear una cuenta corriente con número "002" y un cupo de sobregiro de 500
        CuentaCorriente cuentaCorriente = new CuentaCorriente("002", 500.0);
        cuentaCorriente.consignar(500.0);
        System.out.println("Saldo en Cuenta Corriente: " + cuentaCorriente.getSaldo());

        // Retirar dinero de la cuenta corriente
        exitoRetiro = cuentaCorriente.retirar(800.0); // Esto debería ser exitoso debido al sobregiro
        if (exitoRetiro) {
            System.out.println("Retiro exitoso. Nuevo saldo en Cuenta Corriente: " + cuentaCorriente.getSaldo());
        } else {
            System.out.println("Retiro fallido. Fondos insuficientes.");
        }

        // Crear un bono con un saldo de 1000 y una tasa de interés del 3%
        Bono bono = new Bono(1000.0);
        System.out.println("Saldo en Bono: " + bono.consultarSaldo());
        System.out.println("Intereses en Bono: " + bono.calcularIntereses());
    }
}
