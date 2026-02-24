package com.projectpokemon.pokemonservice.factory.grassPokemon.tangelaFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;

import java.util.List;

public class TangelaFactory implements GrassPokemonInterface {
    @Override
    public String supports() {
        return "Tangela";
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
