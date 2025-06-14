package hackathonmanager.service;

//Classe Singleton

import hackathonmanager.model.Equipe;

import java.util.ArrayList;
import java.util.List;

public class EquipesService {

    private static EquipesService instance;
    private EquipesService() {
        equipes = new ArrayList<>();
    }

    private List<Equipe> equipes;

    public static EquipesService getInstance() {
        if (instance == null){
            instance = new EquipesService();
        }
        return instance;
    }

    public ArrayList<Equipe> getEquipes(){
        return new ArrayList<Equipe>(this.equipes);
    }

    public void adicionarEquipe(Equipe equipe){
        this.equipes.add(equipe);
    }
}
