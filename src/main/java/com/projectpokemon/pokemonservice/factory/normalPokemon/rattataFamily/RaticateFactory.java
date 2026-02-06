package com.projectpokemon.pokemonservice.factory.normalPokemon.rattataFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class RaticateFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Raticate";
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
