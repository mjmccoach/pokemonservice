package com.projectpokemon.pokemonservice.factory.groundPokemon.diglettFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;

import java.util.List;

public class DugtrioFactory implements GroundPokemonInterface {
    @Override
    public String supports() {
        return "Dugtrio";
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
