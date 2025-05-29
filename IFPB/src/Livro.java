import java.util.Objects;

public class Livro {
        private String titulo;
        private int anoDePublicacao;
        private int quantidadeDisponivel;
        private float preco;

    public boolean equals(Livro outro){
            if (outro.titulo.equals(titulo)){
                return false;
            }
            return true;

        }


    public Livro(String a, int b, int c, float d) {
        this.titulo = a;
        this.anoDePublicacao =b;
        this.quantidadeDisponivel =c;
        this.preco = d;
    }

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


    public String toString() {
        return "titulo=" +titulo;

    }


    public boolean equals(String outro) {
        if (outro.equals(titulo))
           return true;
        return false;
    }


    public int hashCode() {
        return 0;
    }
}
