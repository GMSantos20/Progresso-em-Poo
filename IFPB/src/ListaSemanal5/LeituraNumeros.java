package ListaSemanal5;
import java.util.Arrays;
import java.util.Scanner;
public class LeituraNumeros {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("digite uma sequencia de numeros");
        String  [] linhas=input.nextLine().split(",");
        System.out.println(Arrays.toString(linhas));
        int max=0;
        int min=0;
        for(String numeros:linhas){
            int convertido=Integer.parseInt(numeros);
            max=Math.max(convertido,max);
            min=Math.min(convertido,min);
        }
        System.out.println("maior : "+max+"\nmenor :"+min);

    }//FINAL DO MAIN
}//FINAL DA CLASS
