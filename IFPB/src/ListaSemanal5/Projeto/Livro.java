package ListaSemanal5.Projeto;

public class Livro {
    private String titulo;
    private int anoDePublicacao;
    private int quantidadeDisponivel;
    private float preco;



    public void setTitulo(String titulo){
        this.titulo=titulo;

    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }
    public boolean elgual(Livro livro){
        if(livro == null){
            return false;
        }
        return titulo.equals(livro.titulo);
    }
}//final da class

