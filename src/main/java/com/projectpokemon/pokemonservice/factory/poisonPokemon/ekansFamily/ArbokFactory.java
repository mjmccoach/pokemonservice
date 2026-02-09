package com.projectpokemon.pokemonservice.factory.poisonPokemon.ekansFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class ArbokFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Arbok";
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
