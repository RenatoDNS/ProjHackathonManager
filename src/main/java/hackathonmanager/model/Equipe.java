package hackathonmanager.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Estudante> membros;
    private String nome;

    public Equipe(String n) {
        membros = new ArrayList<>();
        this.nome = n;
    }

    public void adicionarMembro(Estudante e){
        membros.add(e);
    }

    // apenas visual
    public void listarMembros(){
        System.out.println("Equipe: " + this.nome);
        System.out.println("  Membros:");
        for (Estudante membro : membros){
            System.out.println("    - " + membro.getNome() + "( " + membro.getInstituicao().getNome() + " | Matrícula: " + membro.getMatricula() + " )");
        }
    }
}
