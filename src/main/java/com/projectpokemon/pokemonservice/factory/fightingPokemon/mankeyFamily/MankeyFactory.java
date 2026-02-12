package com.projectpokemon.pokemonservice.factory.fightingPokemon.mankeyFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class MankeyFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Mankey";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Primeape");
    }

    @Override
    public int getEvolutionLevel() {
        return 28;
    }
}
