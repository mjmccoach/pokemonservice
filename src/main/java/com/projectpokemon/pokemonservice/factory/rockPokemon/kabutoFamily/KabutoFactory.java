package com.projectpokemon.pokemonservice.factory.rockPokemon.kabutoFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class KabutoFactory implements RockPokemonInterface, WaterPokemonInterface {
    @Override
    public String supports() {
        return "Kabuto";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Kabutops");
    }

    @Override
    public int getEvolutionLevel() {
        return 40;
    }
}
