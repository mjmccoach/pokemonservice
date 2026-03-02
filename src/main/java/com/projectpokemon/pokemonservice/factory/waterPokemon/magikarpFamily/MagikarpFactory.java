package com.projectpokemon.pokemonservice.factory.waterPokemon.magikarpFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class MagikarpFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Magikarp";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Gyarados");
    }

    @Override
    public int getEvolutionLevel() {
        return 20;
    }
}
