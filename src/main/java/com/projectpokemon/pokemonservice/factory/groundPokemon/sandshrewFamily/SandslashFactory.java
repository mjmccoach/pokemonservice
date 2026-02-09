package com.projectpokemon.pokemonservice.factory.groundPokemon.sandshrewFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;

import java.util.List;

public class SandslashFactory implements GroundPokemonInterface {
    @Override
    public String supports() {
        return "Sandslash";
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
