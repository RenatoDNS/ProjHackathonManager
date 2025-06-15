package hackathonmanager.model;

public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private Integer notaFinal;
    private String nome;

    public Projeto(Profissional ori, Equipe eq, String n) {
        this.orientador = ori;
        this.equipe = eq;
        this.nome = n;
    }

    public Profissional getOrientador() {
        return this.orientador;
    }

    public Equipe getEquipe() {
        return this.equipe;
    }

    public String getNome() {
        return this.nome;
    }

    public void receberNota(int nota){
        this.notaFinal = nota;
    }

    public int getNotaFinal(){
        return notaFinal;
    }
}
