package com.projectpokemon.pokemonservice.factory.normalPokemon.lickitungFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class LickitungFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Lickitung";
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
