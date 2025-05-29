package ListaSemanal4;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args){
        Triangulo t= new Triangulo();
        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.println("1º lado do triangulo");
            t.setLado1(Integer.parseInt(input.nextLine()));
            System.out.println("2º lado do triangulo");
            t.setLado2(Integer.parseInt(input.nextLine()));
            System.out.println("3º lado do triangulo");
            t.setLado3(Integer.parseInt(input.nextLine()));
            System.out.println(t.tipo());
            System.out.println("Equilateros" +":"+ t.getContadorEquilatero());
            System.out.println("Escalenos" +":"+ t.getContadorEscaleno());
            System.out.println("Isoceles" + ":" + t.getContadorIsoceles());
            System.out.println("deseja continuar?s/n");
            String resposta= input.nextLine();
            if(resposta.equals("s")){
                continue;
            }else{
                break;

            }
        }
    }
}
