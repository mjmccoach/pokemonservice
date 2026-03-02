package com.projectpokemon.pokemonservice.factory.normalPokemon.taurosFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class TaurosFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Tauros";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of();
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }
}
