package com.projectpokemon.pokemonservice.factory.normalPokemon.dittoFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class DittoFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Ditto";
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
