package hackathonmanager.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public Projeto getProjeto() {
        return this.projeto;
    }

    public void avaliar() {
        this.banca.calcularNotaFinal();
        exibirApresentacao();
    }

    // apenas visual
    private void exibirApresentacao(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("-------==+ Apresentação +==-------");
        System.out.println("Local: " + this.local.getCodigo() + " no dia e hora: " + this.dataHora.format(formatter));
        System.out.println("Projeto: " + this.projeto.getNome());
        projeto.getEquipe().listarMembros();
        this.banca.mostrarNotasDosJurados();
        System.out.println("\nNota Final: " + projeto.getNotaFinal());
    }
}
