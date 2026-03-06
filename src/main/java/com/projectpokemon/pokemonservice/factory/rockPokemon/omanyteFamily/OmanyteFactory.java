package com.projectpokemon.pokemonservice.factory.rockPokemon.omanyteFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class OmanyteFactory implements RockPokemonInterface, WaterPokemonInterface {
    @Override
    public String supports() {
        return "Omanyte";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Omastar");
    }

    @Override
    public int getEvolutionLevel() {
        return 40;
    }
}
