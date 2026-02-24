package com.projectpokemon.pokemonservice.factory.waterPokemon.horseaFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class SeadraFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Seadra";
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
