package com.projectpokemon.pokemonservice.factory.fightingPokemon.mankeyFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class PrimeapeFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Primeape";
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
