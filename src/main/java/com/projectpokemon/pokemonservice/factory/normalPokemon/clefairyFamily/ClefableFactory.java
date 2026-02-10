package com.projectpokemon.pokemonservice.factory.normalPokemon.clefairyFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class ClefableFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Clefable";
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
