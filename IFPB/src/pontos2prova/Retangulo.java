package pontos2prova;

public class Retangulo extends FormasGeometricas {
        private double base;
        private double altura;

        public Retangulo(double base,double altura){
            this.base=base;
            this.altura=altura;
        }

        public double calcularArea() {
            double area=base*altura;
            return area;

        }
        public double calcularPerimetro(){
            double perimetro=base*2+altura*2;
            return perimetro;
        }
}
