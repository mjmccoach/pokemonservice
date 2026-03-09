package com.projectpokemon.pokemonservice.factory.normalPokemon.snorlaxFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class SnorlaxFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Snorlax";
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
