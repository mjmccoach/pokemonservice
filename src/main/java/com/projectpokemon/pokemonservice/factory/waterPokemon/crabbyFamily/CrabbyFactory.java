package com.projectpokemon.pokemonservice.factory.waterPokemon.crabbyFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class CrabbyFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Crabby";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Kingler");
    }

    @Override
    public int getEvolutionLevel() {
        return 28;
    }
}
