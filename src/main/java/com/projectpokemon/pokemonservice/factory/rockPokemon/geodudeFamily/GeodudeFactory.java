package com.projectpokemon.pokemonservice.factory.rockPokemon.geodudeFamily;

import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class GeodudeFactory implements RockPokemonInterface {
    @Override
    public String supports() {
        return "Geodude";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Graveler");
    }

    @Override
    public int getEvolutionLevel() {
        return 25;
    }
}
