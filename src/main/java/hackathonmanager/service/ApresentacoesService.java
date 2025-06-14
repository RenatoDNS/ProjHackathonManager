package hackathonmanager.service;

//Classe Singleton

import hackathonmanager.model.Apresentacao;

import java.util.ArrayList;
import java.util.List;

public class ApresentacoesService {

    private static ApresentacoesService instance;
    private ApresentacoesService(){
        apresentacoes = new ArrayList<>();
    }

    private List<Apresentacao> apresentacoes;

    public static ApresentacoesService getInstance(){
        if (instance == null){
            instance = new ApresentacoesService();
        }
        return instance;
    }

    public ArrayList<Apresentacao> getApresentacoes(){
        return new ArrayList<Apresentacao>(this.apresentacoes);
    }

    public void adicionarApresentacao(Apresentacao apresentacao){
        this.apresentacoes.add(apresentacao);
    }
}
