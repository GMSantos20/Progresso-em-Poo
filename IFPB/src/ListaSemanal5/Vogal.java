package ListaSemanal5;

import java.util.Scanner;
public class Vogal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("digite uma palavra");
        String palavra= input.nextLine().toLowerCase();

       int vogais=0;
       int consoantes=0;
        for(int i = 0;i<palavra.length();i++) {
            char c = palavra.charAt(i);
            if(c == 'a'|| c =='e'||c=='i'||c=='o'||c=='u'){
                vogais++;
            }else if (c >= 'a' && c <= 'z') {
                consoantes++;

            }


        }
        System.out.println("vogais :"+vogais+"\nconsoantes : "+consoantes);
    }
}
