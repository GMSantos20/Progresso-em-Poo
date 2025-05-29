package AulaHerança;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("escolha c(Conta Corrente),e(especial)");
        String escolha=input.nextLine();
        quebrar:while(true){
            switch (escolha){
                case "c":
                    ContaCorrente c =new ContaCorrente();
                    System.out.println("digite seu saldo");
                    c.setSaldo(Float.parseFloat(input.nextLine()));
                    System.out.println("agora saque um valor");
                    c.sacar(Float.parseFloat(input.nextLine()));
                    System.out.println("o seu saldo é:"+ c.getSaldo());
                    break quebrar;

                case "e":
                    ContaEspecial e =new ContaEspecial();
                    System.out.println("digite seu saldo");
                    e.setSaldo(Float.parseFloat(input.nextLine()));
                    System.out.println("agora saque um valor");
                    e.sacar(Float.parseFloat(input.nextLine()));
                    System.out.println("o seu saldo é:"+ e.getSaldo());
                    break;
                default:
                    System.out.println("Escolha errada!!!!");
            }
        }
    }
}
