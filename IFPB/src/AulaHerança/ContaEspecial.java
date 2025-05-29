package AulaHerança;

public class ContaEspecial extends ContaCorrente{

    public void sacar(float v) {
        float taxa = 0.5f;

        if (v > saldo-taxa) {
            System.out.println("saque maior que o esperado");
        } else {
            saldo-=taxa;
            saldo -= v;
        }
    }

}
