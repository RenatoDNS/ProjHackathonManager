package hackathonmanager.model;

import java.util.Random;

public class Jurado extends Profissional {

    private int ultimaNotaDada = 0;

    public Jurado(Empresa inst, String nome) {
        super(inst, nome);
    }

    public int darNota(){
        Random rand = new Random();
        int nota = rand.nextInt(1,11);
        this.ultimaNotaDada = nota;
        return nota;
    }

    public int getUltimaNotaDada() {
        return ultimaNotaDada;
    }
}
