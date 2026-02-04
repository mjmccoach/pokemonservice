package com.projectpokemon.pokemonservice.factory.bugPokemon.caterpieFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class ButterfreeFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Butterfree";
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
