package poo.example1;

public class CuentaBancaria implements OperacionesCuenta {

    private final Cliente cliente;
    private double saldo;

    public CuentaBancaria(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Deposito de " + monto + "" +
                " realizado. Nuevo saldo: " + this.saldo);

    }

    @Override
    public void retirar(double monto) {
        if(this.saldo >= monto){
            this.saldo -= monto;
            System.out.println("Retiro de "+ monto +" realizado. Nuevo saldo: "+this.saldo);
        }else {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cliente=" + cliente.getNombre() + " " + cliente.getApellido() +
                ", saldo=" + saldo +
                '}';
    }
}
