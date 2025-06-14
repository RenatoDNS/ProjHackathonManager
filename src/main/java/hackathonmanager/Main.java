package hackathonmanager;

import hackathonmanager.model.*;
import hackathonmanager.service.ApresentacoesService;
import hackathonmanager.service.EquipesService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        ApresentacoesService apresentacaoService = ApresentacoesService.getInstance();
        EquipesService equipesService = EquipesService.getInstance();

        Universidade pucminas = new Universidade("PUC Minas", "ce ene pe jota");
        Empresa cesgranrio = new Empresa("Cesgranrio", "ce ene pe jota 2");
        Equipe eq1 = new Equipe();
        eq1.adicionarMembro(new Estudante(1, "João da Silva", pucminas));
        eq1.adicionarMembro(new Estudante(2, "Maria Carvalho Costa", pucminas));
        eq1.adicionarMembro(new Estudante(3, "Garibaldo Oliveira", pucminas));
        eq1.adicionarMembro(new Estudante(4, "Jacinta Estácio", pucminas));
        eq1.adicionarMembro(new Estudante(5, "Ulisses Mello", pucminas));
        equipesService.adicionarEquipe(eq1);

        Profissional orientador1 = new Profissional(pucminas, "Geraldo");

        Projeto proj1 = new Projeto(orientador1, eq1);

        Banca banca1 = new Banca(proj1);
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Inácio"));
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Cleitin"));
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Tobias"));
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Henrique"));

        Apresentacao apresentacao1 = new Apresentacao(proj1, banca1, new Sala("Sala 001"), LocalDateTime.now());
        apresentacaoService.adicionarApresentacao(apresentacao1);
        apresentacao1.avaliar();


    }
}