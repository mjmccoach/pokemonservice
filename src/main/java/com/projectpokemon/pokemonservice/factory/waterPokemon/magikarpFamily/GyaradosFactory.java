package com.projectpokemon.pokemonservice.factory.waterPokemon.magikarpFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class GyaradosFactory implements WaterPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Gyarados";
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
