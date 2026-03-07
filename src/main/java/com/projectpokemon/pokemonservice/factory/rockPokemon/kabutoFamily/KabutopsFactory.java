package com.projectpokemon.pokemonservice.factory.rockPokemon.kabutoFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class KabutopsFactory implements RockPokemonInterface, WaterPokemonInterface {
    @Override
    public String supports() {
        return "Kabutops";
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
