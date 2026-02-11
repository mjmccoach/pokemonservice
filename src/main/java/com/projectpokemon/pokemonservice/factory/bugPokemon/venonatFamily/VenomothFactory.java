package com.projectpokemon.pokemonservice.factory.bugPokemon.venonatFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class VenomothFactory implements BugPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Venomoth";
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
