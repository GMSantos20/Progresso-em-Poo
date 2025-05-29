package ListaSemanal7;

public class ContaPoupança {
    private String titular;
    private float saldo;
    private String numero;
    private float taxaRendimento;

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public ContaPoupança(String nomeTitular, String numeroConta, float saldoConta, float taxaRendimento){
        this.saldo=saldoConta;
        this.numero=numeroConta;
        this.titular=nomeTitular;
        this.taxaRendimento=taxaRendimento;
    }
    public String toString(){
        return "Conta Poupança"+"  "+
               "/"+ "titular:"+ titular+"/  "+
               "/"+"Numero da Conta:"+numero+"/  "+
                "/"+"Saldo:"+ saldo+"/  "+
                "/"+"Taxa de Rendimento:"+taxaRendimento;
    }
    public  boolean equals(ContaPoupança p){
       if(this.getNumero().equalsIgnoreCase(p.getNumero())){
           return true;
       }else{
           return false;
       }

    }

}
