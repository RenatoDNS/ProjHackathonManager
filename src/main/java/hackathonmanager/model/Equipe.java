package hackathonmanager.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Estudante> membros;

    public Equipe() {
        membros = new ArrayList<>();
    }

    public void adicionarMembro(Estudante e){
        membros.add(e);
    }

    // apenas visual
    public void listarMembros(){
        System.out.println("Estudantes: ");
        for (Estudante membro : membros){
            System.out.println("    - " + membro.getNome() + "( " + membro.getInstituicao().getNome() + " | Matrícula: " + membro.getMatricula() + " )");
        }
    }

}
