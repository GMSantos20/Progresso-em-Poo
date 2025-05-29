public class Porteiro {
    public String Cumprimentar(Pessoa pessoa) {
        if (pessoa.getIdade() < 10) {
            return "ola jovem" +  pessoa.getNome();
        }
        switch (pessoa.getSexo()) {
            case "homem":
                return "bem vindo senhor," + pessoa.getNome();

            case "mulher":
                return "bem vinda senhora," + pessoa.getNome();

            default:
                return "ola" +  pessoa.getNome()  + "tenha um otimo dia";

        }
    }
}

