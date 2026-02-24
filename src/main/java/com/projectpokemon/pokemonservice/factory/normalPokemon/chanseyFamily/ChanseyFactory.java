package com.projectpokemon.pokemonservice.factory.normalPokemon.chanseyFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class ChanseyFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Chansey";
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
