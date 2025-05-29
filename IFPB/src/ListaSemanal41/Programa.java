package ListaSemanal41;
import java.util.Scanner;
public class Programa {
    public static void main(String[]  args){
        Trabalhador t=new Trabalhador();
        Scanner input=new Scanner(System.in);
        Contador c=new Contador();
        float imposto=0;
        //entradas dos dados
        System.out.println("quantos funcionario a empresa tem?");
        int funcionarios=Integer.parseInt(input.nextLine());
        float impostoArrecadado=0;

        for(int i =0;i<funcionarios; i++){
            System.out.println(" ");
            System.out.println("funcionario"+" "+ (i+1)+"º");
            System.out.println("salario");
            t.setSalarioBruto(Float.parseFloat(input.nextLine()));
            System.out.println("quantidade de dependentes");
            t.setQntDependentes(Integer.parseInt(input.nextLine()));
            imposto+=c.CalcularImposto(t);
            impostoArrecadado+= imposto;
            System.out.printf("imposto %.2f", imposto);
        }
        System.out.println(" ");
        System.out.printf("imposto arrecadado: %.2f", impostoArrecadado);

    }
}
