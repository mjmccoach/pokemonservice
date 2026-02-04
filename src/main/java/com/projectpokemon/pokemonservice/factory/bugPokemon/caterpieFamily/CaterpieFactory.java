package com.projectpokemon.pokemonservice.factory.bugPokemon.caterpieFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class CaterpieFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Caterpie";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Metapod");
    }

    @Override
    public int getEvolutionLevel() {
        return 7;
    }
}
