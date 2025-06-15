package hackathonmanager.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Integer, Jurado> jurados;

    public Banca(Projeto proj){
        this.projetoAvaliado = proj;
        jurados = new HashMap<Integer, Jurado>();
    }

    public void adicionarJurado(Jurado j){
        jurados.put((new Random().nextInt()), j);
    }

    public void calcularNotaFinal() {
        Integer nota = 0;
        for (Map.Entry<Integer, Jurado> pair : jurados.entrySet()) {
            nota += pair.getValue().darNota();
        }
        nota = (int)Math.round((double)nota / 4);
        projetoAvaliado.receberNota(nota);
    }

    // apenas visual
    public void mostrarNotasDosJurados() {
        System.out.println("Jurados: ");
        for (Map.Entry<Integer, Jurado> pair : jurados.entrySet()) {
            Jurado jurado = pair.getValue();
            System.out.println("    - " + jurado.getNome() + ": " + jurado.getUltimaNotaDada());
        }
    }
}
