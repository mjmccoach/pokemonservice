package com.projectpokemon.pokemonservice.factory.waterPokemon.psyduckFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class GolduckFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Golduck";
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
