package ListaSemanal3;

public enum ResultadoIMC {  Abaixo_Do_Peso("abaixo do peso"),
    Peso_Normal("peso normal"),
    Sobrepeso("Sobrepeso"),
    Obesidade("Obesidade");
    private String descriçao;

    ResultadoIMC(String descricao) {
        this.descriçao = descricao;
    }
    public String getDescriçao() {
        return descriçao;
    }
}

