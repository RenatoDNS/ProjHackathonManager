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

    public Instituicao getInstituicao() {
        return this.instituicao;
    }

    protected void setInstituicao(Instituicao inst) {
        this.instituicao = inst;
    }
}
