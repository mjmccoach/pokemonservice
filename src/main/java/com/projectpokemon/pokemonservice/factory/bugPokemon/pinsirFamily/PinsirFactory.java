package com.projectpokemon.pokemonservice.factory.bugPokemon.pinsirFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class PinsirFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Pinsir";
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
