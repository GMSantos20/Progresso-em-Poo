package ListaSemanal7;

public class metodos {

    public static int maiorValor(int a,int b){
        return Math.max(a,b);
    }
    public static int maiorValor(int a, int b,int c){
        return maiorValor(maiorValor(a,b),c);
    }
    public static int maiorValor(int a , int b, int c, int d){
        return maiorValor(maiorValor(a,b) ,maiorValor(c,d));
    }
    public static int maiorValor(int a, int b,int c,int d,int e){
        return maiorValor(maiorValor(a,b),maiorValor(c,d),e);
    }
}
