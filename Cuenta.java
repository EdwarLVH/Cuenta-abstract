public abstract class Cuenta {
    private String número;
    protected double saldo;

    public Cuenta(String número) {
        this.número = número;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNúmero() {
        return número;
    }

    public void consignar(double cantidad) {
        this.saldo += cantidad;
    }

    public abstract boolean retirar(double cantidad);
}
