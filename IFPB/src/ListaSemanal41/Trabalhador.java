package ListaSemanal41;

public class Trabalhador {
    private float salarioBruto;
    private int qntDependentes;

    public float getSalarioBruto(){
        return salarioBruto;
    }
    public int getQntDependentes(){
        return qntDependentes;
    }

    public void setQntDependentes(int qntDependentes) {
        this.qntDependentes = qntDependentes;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
