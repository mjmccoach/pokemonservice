package com.projectpokemon.pokemonservice.factory.bugPokemon.weedleFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class WeedleFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Weedle";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Kakuna");
    }

    @Override
    public int getEvolutionLevel() {
        return 7;
    }
}
