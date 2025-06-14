package hackathonmanager.model;

import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto proj, Avaliavel banca, Sala local, LocalDateTime dataHora){
        this.projeto = proj;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public void avaliar() {
        this.banca.calcularNotaFinal();
        exibirApresentacao();
    }

    // apenas visual
    private void exibirApresentacao(){
        System.out.println("-------==+ Apresentação +==-------");
        projeto.getEquipe().listarMembros();
        this.banca.mostrarNotasDosJurados();
        System.out.println("\nNota Final: " + projeto.getNotaFinal());
    }
}
