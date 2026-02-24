package com.projectpokemon.pokemonservice.factory.waterPokemon.horseaFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class HorseaFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Horsea";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Seadra");
    }

    @Override
    public int getEvolutionLevel() {
        return 32;
    }
}
