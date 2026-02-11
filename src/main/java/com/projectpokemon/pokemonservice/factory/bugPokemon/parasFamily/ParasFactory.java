package com.projectpokemon.pokemonservice.factory.bugPokemon.parasFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;
import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;

import java.util.List;

public class ParasFactory implements BugPokemonInterface, GrassPokemonInterface {
    @Override
    public String supports() {
        return "Paras";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Parasect");
    }

    @Override
    public int getEvolutionLevel() {
        return 24;
    }
}
