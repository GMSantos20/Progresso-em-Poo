package pontos2prova;

public class Cirulo extends FormasGeometricas{
    private double raio;

    public Cirulo(double raio){
        this.raio=raio;
    }

    @Override
    public double calcularArea() {
        double area= Math.PI*raio*raio;
        return area;
    }

    @Override    public double calcularPerimetro() {
        double perimetro=2*Math.PI*raio;
        return perimetro;
    }
}
