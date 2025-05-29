package ListaSemanal7;

public class ContaCorrente {
    private String titular;
    private float saldo;
    private float chequeEspecial;
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

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ContaCorrente(String nomeTitutlar, String numeroConta, float saldoConta, float limiteChequeEsp) {
        this.saldo = saldoConta;
        this.titular = nomeTitutlar;
        this.chequeEspecial = limiteChequeEsp;
        this.numero = numeroConta;

    }

    public String toString() {
        return "Conta Corrente" + "  " +
                "/" + "titular:" + titular + "/  " +
                "/" + "Numero da Conta:" + numero + "/  " +
                "/" + "Saldo:" + saldo + "/  " +
                "/" + "Limite de Cheque Especial:" + chequeEspecial;
    }
    public  boolean equals(ContaCorrente c) {
        if (this.getNumero().equalsIgnoreCase(c.getNumero())) {
            return true;
        } else {
            return false;
        }


    }}
