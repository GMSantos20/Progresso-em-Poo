package ListaSemanal3;

public class Nutricionista {
    public Programa.ResultadoIMC avaliarIMC(Paciente pessoa){
        float imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
        if (imc < 18.5){
            return Programa.ResultadoIMC.Abaixo_Do_Peso;
        }else if(imc< 25){
            return Programa.ResultadoIMC.Peso_Normal;
        }else if(imc < 30){
            return Programa.ResultadoIMC.Sobrepeso;
        }else {
            return Programa.ResultadoIMC.Obesidade;
        }
    }
}
