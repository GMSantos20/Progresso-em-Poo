package pontos2prova;

public class Triangulo extends FormasGeometricas{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    @Override
    public double calcularArea() {
        double p=lado1+lado2+lado3/2;
        double calc=p*(p-lado1)*(p-lado2)*(p-lado3);
        double area=Math.sqrt(calc);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro=lado1+lado2+lado3;
        return perimetro;

    }

}
