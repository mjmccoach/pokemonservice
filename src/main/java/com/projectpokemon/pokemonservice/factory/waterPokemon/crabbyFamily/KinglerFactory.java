package com.projectpokemon.pokemonservice.factory.waterPokemon.crabbyFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class KinglerFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Kingler";
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
