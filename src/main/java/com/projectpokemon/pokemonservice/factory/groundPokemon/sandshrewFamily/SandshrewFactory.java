package com.projectpokemon.pokemonservice.factory.groundPokemon.sandshrewFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;

import java.util.List;

public class SandshrewFactory implements GroundPokemonInterface {
    @Override
    public String supports() {
        return "Sandshrew";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Sandslash");
    }

    @Override
    public int getEvolutionLevel() {
        return 22;
    }
}
