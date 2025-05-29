package ListaSemanal7;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("primeiro valor");
        int v1=input.nextInt();
        System.out.println("segundo valor");
        int v2= input.nextInt();
        System.out.println("terceiro valor");
        int v3= input.nextInt();
        System.out.println("quarto valor");
        int v4= input.nextInt();
        System.out.println("quinto valor");
        int v5=input.nextInt();

        int maior=metodos.maiorValor(v1,v2);
        System.out.println("o maior valor entre os 2 numeros é: "+maior);
        maior=metodos.maiorValor(v1,v2,v3);
        System.out.println("o maior valor entre os 3 numeros é: "+maior);
        maior=metodos.maiorValor(v1,v2,v3,v4);
        System.out.println("o maior valor entre os 4 numeros é: "+maior);
        maior=metodos.maiorValor(v1,v2,v3,v4,v5);
        System.out.println("o maior valor entre os 5 numeros é: "+maior);

    }

}
