package com.projectpokemon.pokemonservice.factory.waterPokemon.seelFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class SeelFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Seel";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Dewgong");
    }

    @Override
    public int getEvolutionLevel() {
        return 34;
    }
}
