package com.projectpokemon.pokemonservice.factory.bugPokemon.scytherFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class ScytherFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Scyther";
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
