public class Bono implements Rentable {
    private double saldo;
    private double interés;

    public Bono(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public double calcularIntereses() {
        return saldo * interés;
    }
}
