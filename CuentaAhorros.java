public class CuentaAhorros extends Cuenta implements Rentable {
    private double interés;

    public CuentaAhorros(String número, double interés) {
        super(número);
        this.interés = interés;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    @Override
    public double calcularIntereses() {
        return saldo * interés;
    }
}
