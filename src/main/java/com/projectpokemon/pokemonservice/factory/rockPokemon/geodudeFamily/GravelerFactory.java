package com.projectpokemon.pokemonservice.factory.rockPokemon.geodudeFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class GravelerFactory implements RockPokemonInterface {
    @Override
    public String supports() {
        return "Graveler";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Golem");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithTrade() {
        return true;
    }
}
