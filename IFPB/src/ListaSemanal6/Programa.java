package ListaSemanal6;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[5];
        int pessoasCadastradas = 0;
        int qntErros = 0;
        while (pessoasCadastradas < 5) {
            System.out.println("nome");
            String nome = input.nextLine();
            System.out.println("estado civil(CASADO,SOLTEIRO,SEPARADO,VIUVO)");
            EstadoCivil estado = EstadoCivil.valueOf(input.nextLine().toUpperCase());
            System.out.println("idade");
            int idade = Integer.parseInt(input.nextLine());



            boolean verificaigual = false;
            for (int i = 0; i < pessoasCadastradas; i++) {
                if (pessoas[i].getNome().equals(nome) && pessoas[i].getIdade() == idade && pessoas[i].getEstadoCivil() == estado) {
                    verificaigual = true;
                    break;
                }
            }
            if (verificaigual ) {

                System.out.println("pessoa ja cadastrada, tente novamente");
                qntErros++;

            } else {
                pessoas[pessoasCadastradas] = new Pessoa(nome, idade, estado);
                pessoasCadastradas++;
                System.out.println("cadastro realizado com sucesso");

                }


        }//final do while
        System.out.println("lista de pessoas");
        for(Pessoa p:pessoas){
            System.out.println(p);
        }
        int solteiros=0;
        int casados=0;
        int separados=0;
        int viuvos=0;

        for(Pessoa p:pessoas){
            if (p.getEstadoCivil() == EstadoCivil.SOLTEIRO) {
                solteiros++;
            } else if (p.getEstadoCivil() == EstadoCivil.CASADO) {
                casados++;
            } else if (p.getEstadoCivil() == EstadoCivil.VIUVO) {
                viuvos++;
            } else if (p.getEstadoCivil() == EstadoCivil.SEPARADO) {
                separados++;
            }

        }
        System.out.println("pessoas cadastradas" + pessoasCadastradas);
        System.out.println("solteiros"+ solteiros);
        System.out.println("casados"+ casados);
        System.out.println("separados"+separados);
        System.out.println("vivuvos"+viuvos);
        System.out.println("erros"+qntErros);

    }

}
