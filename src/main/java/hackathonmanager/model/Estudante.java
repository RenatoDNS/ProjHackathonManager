package hackathonmanager.model;

public class Estudante extends Pessoa {
    private int matricula;

    public Estudante(int mat, String n, Universidade inst){
        super(n);
        this.matricula = mat;
        this.setInstituicao(inst);
    }

    public int getMatricula() {
        return matricula;
    }
}
