package entidades;

public abstract class Conta {
    private int numero;
    private Titular titular;
    private double saldo;

    public Conta(int numero, Titular titular) {
        this.saldo=0;
        this.numero = numero;
        this.titular = titular;
    }


    //Retorna o numero da conta
    public abstract int getNumero();

    //comportamento de saque
    public abstract void sacar(double valor);

    //comportamento de deposito
    public abstract void depositar(double valor);

    //retorna saldo;
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public abstract void depositar();
}

