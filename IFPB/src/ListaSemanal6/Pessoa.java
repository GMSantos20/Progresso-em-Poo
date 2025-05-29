package ListaSemanal6;

public class Pessoa {
    private String nome;
    private int idade;
    private EstadoCivil estadoCivil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Pessoa(){
        nome= "desconhecido";
        idade=18;
        estadoCivil=EstadoCivil.SOLTEIRO;
    }
    public Pessoa(String NovoNome,int NovaIdade, EstadoCivil NovoEstado){
        this.nome=NovoNome;
        this.idade=NovaIdade;
        this.estadoCivil=NovoEstado;
    }
    public String toString() {
        if(idade<=11){
            return nome +"infancia";
        }else if (idade>=12 && idade<=20){
            return nome +"adolescencia";
        }else if(idade >=21 && idade<=59){
            return nome+ "fase adulta";
        }else{
            return nome+"velhice";
        }
    }
    public boolean equals(Pessoa pessoa){

        if(nome.equals(pessoa.nome)&&estadoCivil==pessoa.estadoCivil&& idade==pessoa.idade){

        }return false;

    }
}
