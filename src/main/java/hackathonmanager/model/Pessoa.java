package hackathonmanager.model;

public abstract class Pessoa {
    private String nome;
    private Instituicao instituicao;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instituicao getInstituicao() {
        return this.instituicao;
    }
}
