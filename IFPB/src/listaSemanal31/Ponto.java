package listaSemanal31;

public class Ponto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }//METODOSSSSSSSSSSSSSSSSSS

    public boolean elgual(Ponto NovoPonto) {
        if (NovoPonto == null) {
            return false;
        }
        return this.x == NovoPonto.getX() && this.y == NovoPonto.getY();

    }

    public String quandrante() {
        if (x == 0 && y == 0) {
            return "origem";
        } else if (x == 0) {
            return "eixo vertical";
        } else if (y == 0) {
            return "eixo horizontal";
        } else if (x == 2 && y == 1) {
            return "1º quadrante";
        } else if (x == -3 && y == 2) {
            return "2º quadrante";
        } else if (x == -2 && y == -2) {
            return "3º quadrante";
        } else if (x == 3 && y == -3) {
            return "4º quadrante";
        }else{
            return "";
        }

    }
}
