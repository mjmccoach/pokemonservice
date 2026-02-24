package com.projectpokemon.pokemonservice.factory.poisonPokemon.koffingFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class WeezingFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Weezing";
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
