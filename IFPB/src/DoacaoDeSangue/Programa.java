package DoacaoDeSangue;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        AtendenteDaEnfermaria avaliar = new AtendenteDaEnfermaria();
//pessoa numero1
        System.out.println("idade");
        p1.setIdade(Integer.parseInt(input.nextLine()));
        System.out.println("peso");
        p1.setPeso(Double.parseDouble(input.nextLine()));
        System.out.println("nome");
        p1.setNome(input.nextLine());
        System.out.println("ingeriu alcool nas ultimas 12H? true/false");
        boolean ingeriualcool = Boolean.parseBoolean(input.nextLine());
        System.out.println("fez tatuagem no ultimo ano? true/false");
        boolean fezTatuagem = Boolean.parseBoolean(input.nextLine());
        boolean podeDoar = avaliar.avaliarDoador(p1, fezTatuagem, ingeriualcool);
        System.out.println(p1.getNome() + podeDoar);
//pessoa numero2
        System.out.println("idade");
        p2.setIdade(Integer.parseInt(input.nextLine()));
        System.out.println("peso");
        p2.setPeso(Double.parseDouble(input.nextLine()));
        System.out.println("nome");
        p2.setNome(input.nextLine());
        System.out.println("ingeriu alcool nas ultimas 12H? true/false");
        boolean ingeriualcool2 = Boolean.parseBoolean(input.nextLine());
        System.out.println("fez tatuagem no ultimo ano? true/false");
        boolean fezTatuagem2 = Boolean.parseBoolean(input.nextLine());
        boolean podeDoar2 = avaliar.avaliarDoador(p2, fezTatuagem2, ingeriualcool2);
        System.out.println(p2.getNome() + podeDoar2);
    }
}
