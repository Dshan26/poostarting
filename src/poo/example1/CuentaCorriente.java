package poo.example1;

public class CuentaCorriente extends CuentaBancaria{

    private final double descubierto;

    public CuentaCorriente(Cliente cliente, double saldo, double descubierto) {
        super(cliente, saldo);
        this.descubierto = descubierto;
    }

    // Método polimórfico toString
    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "cliente=" + super.toString() +
                ", descubierto=" + descubierto +
                '}';
    }
}
