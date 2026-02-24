package com.projectpokemon.pokemonservice.factory.groundPokemon.rhyhornFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;
import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class RhyhornFactory implements GroundPokemonInterface, RockPokemonInterface {
    @Override
    public String supports() {
        return "Rhyhorn";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Rhydon");
    }

    @Override
    public int getEvolutionLevel() {
        return 42;
    }
}
