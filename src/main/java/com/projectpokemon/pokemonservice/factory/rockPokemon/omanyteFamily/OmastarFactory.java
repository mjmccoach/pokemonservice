package com.projectpokemon.pokemonservice.factory.rockPokemon.omanyteFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class OmastarFactory implements RockPokemonInterface, WaterPokemonInterface {
    @Override
    public String supports() {
        return "Omastar";
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
