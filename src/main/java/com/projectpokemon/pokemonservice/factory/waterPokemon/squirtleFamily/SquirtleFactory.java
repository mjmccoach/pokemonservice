package com.projectpokemon.pokemonservice.factory.waterPokemon.squirtleFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class SquirtleFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Squirtle";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Wartortle");
    }

    @Override
    public int getEvolutionLevel() {
        return 16;
    }
}
