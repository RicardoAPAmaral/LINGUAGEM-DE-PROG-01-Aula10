package entidades;

public class ContaCorrente extends Conta{

    private double LimitePremium;

    public ContaCorrente(int numero, Titular titular) {
        super(numero, titular);
        this.LimitePremium=100.0;
    }

    //Métodos get and set


    public double getLimitePremium() {
        return LimitePremium;
    }

    public void setLimitePremium(double limitePremium) {
        LimitePremium = limitePremium;
    }

    @Override
    public int getNumero() {
        return this.getNumero();
    }


    @Override
    public void sacar(double valorSaque) {
    if (valorSaque> this.verificarSaldo()+getLimitePremium()){
        System.out.println("Saldo insuficiente!");
    }else{
        if (valorSaque<=this.verificarSaldo()){
            //Atualização do saldo
            this.setSaldo(this.getSaldo()-valorSaque);
        }else{
            //verificar quanto está faltando
            double diferenca=this.getSaldo() - valorSaque;

            //subtrair do limitePremium
            this.setLimitePremium(getLimitePremium()-diferenca);
            this.setSaldo((this.getSaldo()-valorSaque));
        }
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor>0){
            this.setSaldo(valor+this.getSaldo());
        }else{
            System.out.println("Valor de depósito inválido!");
        }

    }

    @Override
    public void depositar() {

    }

    public double verificarSaldo() {
        return this.getSaldo();
    }

}
