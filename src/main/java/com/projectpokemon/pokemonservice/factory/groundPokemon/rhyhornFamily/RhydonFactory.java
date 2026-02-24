package com.projectpokemon.pokemonservice.factory.groundPokemon.rhyhornFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;
import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class RhydonFactory implements GroundPokemonInterface, RockPokemonInterface {
    @Override
    public String supports() {
        return "Rhydon";
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
