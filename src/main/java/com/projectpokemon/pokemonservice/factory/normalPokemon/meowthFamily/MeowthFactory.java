package com.projectpokemon.pokemonservice.factory.normalPokemon.meowthFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class MeowthFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Meowth";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Persian");
    }

    @Override
    public int getEvolutionLevel() {
        return 28;
    }
}
