package com.projectpokemon.pokemonservice.factory.waterPokemon.staryuFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class StarmieFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Starmie";
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
