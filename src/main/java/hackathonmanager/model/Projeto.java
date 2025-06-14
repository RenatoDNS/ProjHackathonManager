package hackathonmanager.model;

public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private Integer notaFinal;

    public Projeto(Profissional ori, Equipe eq){
        this.orientador = ori;
        this.equipe = eq;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void receberNota(int nota){
        this.notaFinal = nota;
    }

    public int getNotaFinal(){
        return notaFinal;
    }
}
