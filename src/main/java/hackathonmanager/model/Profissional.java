package hackathonmanager.model;

public class Profissional extends Pessoa {
    public Profissional(Instituicao inst, String n){
        super(n);
        this.setInstituicao(inst);
    }
}
