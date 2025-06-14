package hackathonmanager.model;

public abstract class Pessoa {
    private String nome;
    private Instituicao instituicao;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    protected void setInstituicao(Instituicao inst) {
        this.instituicao = inst;
    }

    public Instituicao getInstituicao() {
        return this.instituicao;
    }
}
