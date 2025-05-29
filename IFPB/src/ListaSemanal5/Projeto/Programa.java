package ListaSemanal5.Projeto;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livraria livraria = new Livraria();



        int escolha;

        do {

            System.out.println("1.cadastrar livro");
            System.out.println("2.listar estoque");
            System.out.println("3.vender um livro");
            System.out.println("4.consultar caixa da livraria");
            System.out.println("5.encerrar programa");

            escolha = Integer.parseInt(input.nextLine());

            switch (escolha) {

                case 1:
                    Livro livro = new Livro();
                    System.out.println("Titulo");
                    livro.setTitulo(input.nextLine());
                    System.out.println("Ano");
                    livro.setAnoDePublicacao(Integer.parseInt(input.nextLine()));
                    System.out.println("Quantidade");
                    livro.setQuantidadeDisponivel(Integer.parseInt(input.nextLine()));
                    System.out.println("Preço");
                    livro.setPreco(Float.parseFloat(input.nextLine()));
                    livraria.cadastrarLivro(livro);
                    System.out.println("livro cadastrado com sucesso");
                    break;

                case 2:
                    if (livraria.getQuantidadeDeLivrosCadastrados() == 0) {
                        System.out.println("NENHUM LIVRO CADASTRADO");

                    } else {
                        for (int livros = 0; livros < livraria.getQuantidadeDeLivrosCadastrados(); livros++) {
                            Livro livro1 = livraria.getEstoque()[livros];
                            System.out.printf("TITULO :" + livro1.getTitulo());
                            System.out.printf("ANO :" + livro1.getAnoDePublicacao());
                            System.out.printf("QUANTIDADE :" + livro1.getQuantidadeDisponivel());
                            System.out.printf("PREÇO :" + livro1.getPreco());

                        }


                    }break;
                case 3:
                    System.out.println("digite o titulo a ser vendido");
                    String titulo=input.nextLine();
                    livraria.comprarLivro(titulo);
                    System.out.println(titulo + " vendido");
                    break;
                case 4:
                    System.out.println("saldo : " + livraria.getSaldoEmCaixa());
                    break;

                case 5:
                    System.out.println("encerrando programa");
                    break;
            }

        } while (escolha != 5) ;
    }

}

