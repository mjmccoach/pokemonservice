package com.projectpokemon.pokemonservice.factory.rockPokemon.onixFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;
import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class OnixFactory implements RockPokemonInterface, GroundPokemonInterface {
    @Override
    public String supports() {
        return "Onix";
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
