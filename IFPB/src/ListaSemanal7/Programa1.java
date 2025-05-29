    package ListaSemanal7;

    import java.util.Scanner;
    public class Programa1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ContaCorrente[] contaCorrentes = new ContaCorrente[100];
            ContaPoupança[] contaPoupanças = new ContaPoupança[100];
            int contadorcorrente = 0;
            int contadorpoupança = 0;

            while (true) {
                System.out.println("qual tipo de conta deseja abrir?Corrente(c)/Poupança(p)/sair(s)");
                String decisao = input.nextLine();
                if (decisao.equalsIgnoreCase("s")) {
                    break;
                }
                float saldo = -1;
                float cheque = -1;
                String numeroconta = "";
                float taxarendimento=-1;
                if (decisao.equalsIgnoreCase("c")) {
                    System.out.println("Nome do Titular");
                    String nome = input.nextLine();
                    while (true) {
                        System.out.println("Qual o saldo da conta?");
                        saldo = Float.parseFloat(input.nextLine());
                        if (saldo >= 0) break;
                        System.out.println("numero invalido");
                    }
                    while (true) {
                        System.out.println("limite do cheque especial");
                        cheque = Float.parseFloat(input.nextLine());
                        if (cheque > 0) break;
                        System.out.println("numero invalido");
                    }
                    while (true) {
                        System.out.println("digite o numero da conta");
                        numeroconta = input.nextLine();
                        if (numeroconta == null || numeroconta.isEmpty()) {
                            System.out.println("digite o numero da conta");
                            continue;
                        }
                        boolean existenumero= false;
                        for(int i=0;i<contadorcorrente;i++){
                            if(contaCorrentes[i].getNumero().equalsIgnoreCase(numeroconta)){
                                existenumero=true;
                                break;
                            }

                        }
                        if(existenumero){
                            System.out.println("Conta ja cadastrada!,tente novamente");
                            continue;
                        }
                        contaCorrentes[contadorcorrente] = new ContaCorrente(nome, numeroconta, saldo, cheque);
                        contadorcorrente++;

                        System.out.println("conta cadastrada com sucesso");

                        break;
                    }
                }
                else if (decisao.equalsIgnoreCase("p")) {
                    System.out.println("Nome do Titular");
                    String nomep = input.nextLine();
                    while (true) {
                        System.out.println("Qual o saldo da conta?");
                        saldo = Float.parseFloat(input.nextLine());
                        if (saldo >= 0) break;
                        System.out.println("numero invalido");
                    }
                    while (true) {
                        System.out.println("taxa de rendimento");
                        taxarendimento = Float.parseFloat(input.nextLine());
                        if (taxarendimento > 0) break;
                        System.out.println("numero invalido");
                    }
                    while (true) {
                        System.out.println("digite o numero da conta");
                        numeroconta = input.nextLine();
                        if (numeroconta == null || numeroconta.isEmpty()) {
                            System.out.println("digite o numero da conta");
                            continue;
                        }
                        boolean existenumero= false;
                        for(int i=0;i<contadorpoupança;i++){
                            if(contaPoupanças[i].getNumero().equalsIgnoreCase(numeroconta)){
                                existenumero=true;
                                break;
                            }

                        }
                        if(existenumero){
                            System.out.println("Conta ja cadastrada!,tente novamente");
                            continue;
                        }

                        contaPoupanças[contadorpoupança] = new ContaPoupança(nomep, numeroconta, saldo, taxarendimento);
                        contadorpoupança++;

                        System.out.println("conta cadastrada com sucesso");
                        break;



                    }
                }
            }
            for(ContaCorrente c:contaCorrentes){
               if(c!=null){
                   System.out.println(c);
               }
            }
            for(ContaPoupança p:contaPoupanças){
                if(p!=null){
                    System.out.println(p);
                }
            }
            System.out.println("quantidade de contas conrrente cadastradas:"+contadorcorrente);
            System.out.println("quantidade de contas poupança cadastradas:"+contadorpoupança);
            }

    }
