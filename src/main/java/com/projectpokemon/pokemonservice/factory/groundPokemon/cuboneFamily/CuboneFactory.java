package com.projectpokemon.pokemonservice.factory.groundPokemon.cuboneFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;

import java.util.List;

public class CuboneFactory implements GroundPokemonInterface {
    @Override
    public String supports() {
        return "Cubone";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Marowak");
    }

    @Override
    public int getEvolutionLevel() {
        return 28;
    }
}
