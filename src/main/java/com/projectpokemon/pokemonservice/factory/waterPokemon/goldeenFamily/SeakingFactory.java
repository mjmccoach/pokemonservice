package com.projectpokemon.pokemonservice.factory.waterPokemon.goldeenFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class SeakingFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Seaking";
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
