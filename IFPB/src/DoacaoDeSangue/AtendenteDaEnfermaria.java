package DoacaoDeSangue;

public class AtendenteDaEnfermaria {
    public boolean avaliarDoador(Pessoa pessoa,boolean fezTatuagem,boolean ingeriuAlcool12h){
        if (pessoa.getIdade() <=19 || pessoa.getIdade() > 69){
           return false;
        }
        if (pessoa.getPeso() < 50){
            return false;
        }
        if (fezTatuagem){
            return false;
        }
        if (ingeriuAlcool12h){
            return false;
        }else{
            return true;
        }
    }

}
