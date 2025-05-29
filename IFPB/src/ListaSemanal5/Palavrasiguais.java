package ListaSemanal5;
import java.util.Scanner;
public class Palavrasiguais {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1º palavra");
        String palavra1= input.nextLine();
        String palavra2;
        do{
            System.out.println("2º palavra nao pode ser igual a primeira");
             palavra2=input.nextLine();
        }while(palavra1.equalsIgnoreCase(palavra2));

        if (palavra1.compareToIgnoreCase(palavra2)<0){
            System.out.println("Nomes em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else {
            System.out.println("Nomes em ordem alfabética: " + palavra2 + ", " + palavra1);

        }

    }
}
