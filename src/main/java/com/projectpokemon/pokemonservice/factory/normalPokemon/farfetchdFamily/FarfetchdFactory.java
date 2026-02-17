package com.projectpokemon.pokemonservice.factory.normalPokemon.farfetchdFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class FarfetchdFactory implements NormalPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Farfetch'd";
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
