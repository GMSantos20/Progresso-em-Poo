import java.util.Scanner;

 class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("me diga seu nome");
        pessoa.setNome( input.nextLine());
        System.out.println("me fale seu sexo: homem/mulher");
        pessoa.setSexo( input.nextLine());
        System.out.println("digite sua idade");
        pessoa.setIdade( input.nextInt());
        Porteiro Jose = new Porteiro();
        System.out.println(Jose.Cumprimentar(pessoa));

    }
}