package com.projectpokemon.pokemonservice.factory.bugPokemon.weedleFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class BeedrillFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Beedrill";
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
