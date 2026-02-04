package com.projectpokemon.pokemonservice.factory.bugPokemon.weedleFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;

import java.util.List;

public class KakunaFactory implements BugPokemonInterface {
    @Override
    public String supports() {
        return "Kakuna";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Beedrill");
    }

    @Override
    public int getEvolutionLevel() {
        return 10;
    }
}
