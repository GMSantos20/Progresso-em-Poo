package AulaHerança;

public class ContaCorrente {
    private String titular;
    protected float saldo;
    private String numero;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        if(saldo<0){
            saldo=0;
        }
        else {
            this.saldo = saldo;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void sacar(float v){

        if(v>--saldo){
            System.out.println("saque maior que o esperado");
        }else{

            saldo-=v;

          }
    }
    public void depositar(float v){
        saldo+=v;
    }
}
