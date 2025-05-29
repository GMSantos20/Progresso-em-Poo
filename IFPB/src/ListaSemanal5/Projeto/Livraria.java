package ListaSemanal5.Projeto;



public class Livraria {
    private Livro[] estoque = new Livro[100] ;
    private int quantidadeDeLivrosCadastrados=0 ;
    private float saldoEmCaixa=0.0f;


    public Livro[] getEstoque() {
        return estoque;
    }

    public int getQuantidadeDeLivrosCadastrados() {
        return quantidadeDeLivrosCadastrados;
    }

    public float getSaldoEmCaixa() {
        return saldoEmCaixa;
    }
    public boolean cadastrarLivro(Livro novoLivro){
        if (quantidadeDeLivrosCadastrados>= estoque.length){
            return false;
        }
       for(int i =0;i<quantidadeDeLivrosCadastrados;i++){
           if(estoque[i].elgual(novoLivro)){
               return false;
           }
       }
       estoque[quantidadeDeLivrosCadastrados]=novoLivro;
       quantidadeDeLivrosCadastrados++;
       return true;
    }//final do metodo cadastrar livro

    public String comprarLivro(String titulo){
        for(int i=0;i<quantidadeDeLivrosCadastrados;i++){
            if(estoque[i].getTitulo().equalsIgnoreCase(titulo)){
                if(estoque[i].getQuantidadeDisponivel()>0){
                    estoque[i].setQuantidadeDisponivel(estoque[i].getQuantidadeDisponivel()-1);
                    saldoEmCaixa+=estoque[i].getPreco();
                    return "sucesso";
                }else{
                    return "esgotado";
                }
            }
        }
        return "nao encontrado";

    }//final do metodo
}//final da class
