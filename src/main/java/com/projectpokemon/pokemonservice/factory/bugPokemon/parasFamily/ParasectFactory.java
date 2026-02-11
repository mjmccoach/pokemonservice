package com.projectpokemon.pokemonservice.factory.bugPokemon.parasFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class ParasectFactory implements BugPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Parasect";
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
