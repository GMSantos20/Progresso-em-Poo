package ListaSemanal4;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    //incremntento
    private int contadorEquilatero = 0;
    private int contadorEscaleno=0;
    private int contadorIsoceles=0;

    public int getContadorEquilatero() {
        return contadorEquilatero;
    }

    public int getContadorIsoceles() {
        return contadorIsoceles;
    }

    public int getContadorEscaleno() {
        return contadorEscaleno;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
//CONTADORES PARA INCREMENTAR
    int EQUILATERO=0;
    int ISOCELES=0;
    int ESCALENO=0;

    //METODOS//ajustar logica da saida
    public TipoTriangulo tipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            contadorEquilatero++;
            return TipoTriangulo.Equilatero;
        } else if (lado1 == lado2 || lado1 ==lado3 || lado2==lado3) {
            contadorIsoceles++;
            return TipoTriangulo.Isoceles;
        } else {
            contadorEscaleno++;
            return TipoTriangulo.Escaleno;
        }
    }

}

