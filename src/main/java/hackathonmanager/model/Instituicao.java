package hackathonmanager.model;

public abstract class Instituicao {
    private String nome;
    private String cnpj;

    Instituicao(String n, String c){
        this.nome = n;
        this.cnpj = c;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }
}
