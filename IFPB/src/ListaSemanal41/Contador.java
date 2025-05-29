package ListaSemanal41;

public class Contador {
//a cada dependente é necessario extrair 189,59 da renda bruta,para estimar o valor a ser pago do imposto
//deve retirar 8% referente a contribuiçao do inss
    public float CalcularImposto(Trabalhador trabalhador){
        float salario = trabalhador.getSalarioBruto();
        int dependentes=trabalhador.getQntDependentes();
        float deduducaoDependentes= 189.59f;
        float calculo= salario -(dependentes * deduducaoDependentes);

        float imposto=0;
        if(calculo < 1903.98f){
            imposto = 0;

        }else if (calculo<= 2826.65f){
            imposto=(calculo*7.5f/100)-142.80f;

        }else if ( calculo<=3751.05f){
            imposto=(calculo*15f/100)-354.80f;

        }else if (calculo <= 4664.68f){
            imposto=(calculo*22.5f/100)-636.13f;

        }else if (calculo >=4664.69f){
            imposto= (calculo-27.5f/100)-869.36f;
        }
        return  Math.max(imposto, 0);
    }
}
