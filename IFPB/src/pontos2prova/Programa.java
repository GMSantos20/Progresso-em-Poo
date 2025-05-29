package pontos2prova;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Triangulo> triangulo= new ArrayList<Triangulo>();
        ArrayList<Retangulo> retangulo=new ArrayList<Retangulo>();
        ArrayList<Cirulo>   circulo=new ArrayList<Cirulo>();
        double retangulos = 0;
        double triangulos = 0;
        double circulos = 0;

        System.out.println("quantas formas voce deseja criar?");
        int escolha = input.nextInt();
        for (int i = 0; i < escolha; i++) {
            System.out.println("deseja criar um retangulo(r), circulo(c) ou triangulo(t)");
            String escolhaforma = input.nextLine();

            if (escolhaforma.equalsIgnoreCase("r")) {
                System.out.println("digite a base");
                double base = input.nextDouble();
                System.out.println("altura");
                double altura = input.nextDouble();
                Retangulo r = new Retangulo(base, altura);
                System.out.println(r.calcularArea());
                System.out.println(r.calcularPerimetro());
                retangulo.add(r);
                retangulos++;

            } else if (escolhaforma.equalsIgnoreCase("c")) {
                System.out.println("qual o raio");
                double raio= input.nextDouble();
                Cirulo c=new Cirulo(raio);
                System.out.println(c.calcularArea());
                System.out.println(c.calcularPerimetro());
                circulo.add(c);
                circulos++;

            } else if (escolhaforma.equalsIgnoreCase("t")) {
                System.out.println("lado 1");
                double lado1= input.nextDouble();
                System.out.println("lado2");
                double lado2= input.nextDouble();
                System.out.println("lado3");
                double lado3= input.nextDouble();
                Triangulo t=new Triangulo(lado1,lado2,lado3);

                for(Triangulo t1:triangulo){
                    System.out.println(t.calcularPerimetro(t1));
                }
                triangulo.add(t);
                triangulos++;
            }
            System.out.println("qauntidade de retangulos"+retangulos);
            System.out.println("quantidade de triangulos"+triangulos);
            System.out.println("quantidade de circulos"+circulos);


        }
    }
}
