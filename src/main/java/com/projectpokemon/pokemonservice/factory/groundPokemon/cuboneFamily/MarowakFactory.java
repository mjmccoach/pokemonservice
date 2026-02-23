package com.projectpokemon.pokemonservice.factory.groundPokemon.cuboneFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;

import java.util.List;

public class MarowakFactory implements GroundPokemonInterface {
    @Override
    public String supports() {
        return "Marowak";
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
