package ListaSemanal4;

public enum TipoTriangulo {
    Equilatero("Equilatero"),
    Isoceles("Isoceles"),
    Escaleno("Escaleno");
    private String descricao;

    TipoTriangulo(String descricao){
        this.descricao=descricao;
    }

}
