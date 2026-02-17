package com.projectpokemon.pokemonservice.factory.rockPokemon.geodudeFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class GolemFactory implements RockPokemonInterface {
    @Override
    public String supports() {
        return "Golem";
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
