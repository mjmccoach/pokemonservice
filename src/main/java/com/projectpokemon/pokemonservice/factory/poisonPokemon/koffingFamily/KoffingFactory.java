package com.projectpokemon.pokemonservice.factory.poisonPokemon.koffingFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class KoffingFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Koffing";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Weezing");
    }

    @Override
    public int getEvolutionLevel() {
        return 35;
    }
}
