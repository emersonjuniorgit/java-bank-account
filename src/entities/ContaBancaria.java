package entities;

public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private Pessoa pessoa;
    private double limiteChequeEspecial;
    private Boolean usoChequeEspecial;

    public ContaBancaria(double depositar, Pessoa pessoa){
        depositarValor(depositar);
        this.pessoa = pessoa;
    }

    public double getSaldo(){
        if(pessoa == null){
        System.out.println("Realize o cadastro!");
        }
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void depositarValor(double depositar) {
        this.saldo += depositar;
        if (depositar <= 500.00){
            this.chequeEspecial += 50.00;
        } else {
            this.chequeEspecial += depositar * 50.00 / 100.00;
        }
    }

    public void sacarValor(double sacar) {
        this.saldo -= sacar;
    }

    public Boolean verificarSaqueValido(double sacar){
        if(sacar > this.saldo){
            System.out.println("Saque inválido.");
            return false;
        }
        return true;
    }

    public double limiteChequeEspecial(Boolean realizouDeposito){
        if(realizouDeposito == false){
            this.limiteChequeEspecial = this.chequeEspecial + this.saldo;
        }
        return this.limiteChequeEspecial;
    }

    public double checarLimiteChequeEspecial() {
        if (this.chequeEspecial > limiteChequeEspecial) {
            System.out.println("O seu limite foi atingido, será cobrado uma taxa de 20%");
            return this.limiteChequeEspecial * 20.00 / 100.00;
        }
        return this.chequeEspecial;
    }

    public Boolean verificarUsoChequeEspecial(){
        if(!(pessoa == null)){
            this.usoChequeEspecial = true;
            return true;
        }
        return false;
    }

    public void pagarBoleto(double valorBoleto){
        if(this.saldo < valorBoleto){
            System.out.println("Pagamento inválido, pois o saldo atual é insuficiente.");
            return;
        }
        System.out.printf("O seu boleto foi pago, saldo atual: R$ %.2f%n", this.saldo);
        this.saldo -= valorBoleto;
    }
}
