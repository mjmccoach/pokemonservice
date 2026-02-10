package com.projectpokemon.pokemonservice.factory.normalPokemon.jigglypuffFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class WigglytuffFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Wigglytuff";
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
