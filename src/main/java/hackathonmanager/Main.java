package hackathonmanager;

import hackathonmanager.model.*;
import hackathonmanager.service.ApresentacoesService;
import hackathonmanager.service.EquipesService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        ApresentacoesService apresentacaoService = ApresentacoesService.getInstance();
        EquipesService equipesService = EquipesService.getInstance();

        Universidade pucminas = new Universidade("PUC Minas", "12.345.678/0001-99");
        Empresa cesgranrio = new Empresa("Cesgranrio", "98.765.432/0001-11");

        Equipe eq1 = new Equipe("Energético");
        eq1.adicionarMembro(new Estudante(1, "João da Silva", pucminas));
        eq1.adicionarMembro(new Estudante(2, "Maria Carvalho Costa", pucminas));
        eq1.adicionarMembro(new Estudante(3, "Garibaldo Oliveira", pucminas));
        eq1.adicionarMembro(new Estudante(4, "Jacinta Estácio", pucminas));
        eq1.adicionarMembro(new Estudante(5, "Ulisses Mello", pucminas));
        equipesService.adicionarEquipe(eq1);

        Equipe eq2 = new Equipe("Café");
        eq2.adicionarMembro(new Estudante(6, "Pedro do Nascimento", pucminas));
        eq2.adicionarMembro(new Estudante(7, "Olívia dos Santos", pucminas));
        eq2.adicionarMembro(new Estudante(8, "José Cordeiro", pucminas));
        eq2.adicionarMembro(new Estudante(9, "Larissa Emanuela", pucminas));
        eq2.adicionarMembro(new Estudante(10, "Cláudio Fogaça", pucminas));
        equipesService.adicionarEquipe(eq2);

        Profissional orientador1 = new Profissional(pucminas, "Geraldo");

        Profissional orientador2 = new Profissional(pucminas, "Rubens");

        Projeto proj1 = new Projeto(orientador1, eq1, "Uber");

        Projeto proj2 = new Projeto(orientador2, eq2, "99 Taxi");

        Banca banca1 = new Banca(proj1);
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Inácio"));
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Rodrigo"));
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Tobias"));
        banca1.adicionarJurado(new Jurado(cesgranrio, "Avaliador Henrique"));

        Banca banca2 = new Banca(proj2);
        banca2.adicionarJurado(new Jurado(cesgranrio, "Avaliador Erick"));
        banca2.adicionarJurado(new Jurado(cesgranrio, "Avaliador Romário"));
        banca2.adicionarJurado(new Jurado(cesgranrio, "Avaliador Rivaldo"));
        banca2.adicionarJurado(new Jurado(cesgranrio, "Avaliador Lucas"));

        Apresentacao apresentacao1 = new Apresentacao(proj1, banca1, new Sala("Sala 001"), LocalDateTime.of(2025, 6, 17, 17, 0));
        apresentacaoService.adicionarApresentacao(apresentacao1);
        apresentacao1.avaliar();

        Apresentacao apresentacao2 = new Apresentacao(proj2, banca2, new Sala("Sala 002"), LocalDateTime.of(2025, 6, 17, 18, 30));
        apresentacaoService.adicionarApresentacao(apresentacao2);
        apresentacao2.avaliar();

        System.out.println("\n-------== + ==-------");
        System.out.println("Projetos aprovados (nota final >= 7):");
        apresentacaoService.getApresentacoes().stream()
                .filter(a -> a.getProjeto().getNotaFinal() >= 7)
                .forEach(a -> System.out.println("Projeto: " + a.getProjeto().getNome()
                        + " | Orientador: " + a.getProjeto().getOrientador().getNome()
                        + " | Nota Final: " + a.getProjeto().getNotaFinal()));
    }
}