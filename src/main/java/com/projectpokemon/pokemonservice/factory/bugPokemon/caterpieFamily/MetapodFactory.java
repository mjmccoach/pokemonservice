package com.projectpokemon.pokemonservice.factory.bugPokemon.caterpieFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class MetapodFactory implements BugPokemonInterface {

    @Override
    public String supports() {
        return "Metapod";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Butterfree");
    }

    @Override
    public int getEvolutionLevel() {
        return 10;
    }
}
