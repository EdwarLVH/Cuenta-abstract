public class CuentaCorriente extends Cuenta {
    private double cupoSobregiro;

    public CuentaCorriente(String número, double cupo) {
        super(número);
        this.cupoSobregiro = cupo;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (saldo + cupoSobregiro >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
