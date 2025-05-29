
public class Pessoa {
    private String nome;
    private String sexo;
    private  float peso;
    private int altura;
    private int idade;

    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public float getPeso(){
        return peso;
    }
    public int getAltura(){
        return altura;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
