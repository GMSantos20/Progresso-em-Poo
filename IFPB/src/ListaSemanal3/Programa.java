package ListaSemanal3;

import java.util.Scanner;
public class Programa {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Paciente paciente=new Paciente();
        Nutricionista nutricionista=new Nutricionista();
        System.out.println("peso");
        paciente.setPeso((Float.parseFloat(input.nextLine())));
        System.out.println("altura");
        paciente.setAltura(Float.parseFloat(input.nextLine()));
        ResultadoIMC resutado= nutricionista.avaliarIMC(paciente);
        System.out.println("classificaçao" + ":" + resutado.getDescriçao());


    }

    public enum ResultadoIMC {
        Abaixo_Do_Peso("abaixo do peso"),
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
}
