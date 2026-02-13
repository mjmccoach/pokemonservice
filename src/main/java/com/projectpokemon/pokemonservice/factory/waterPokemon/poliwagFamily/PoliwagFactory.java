package com.projectpokemon.pokemonservice.factory.waterPokemon.poliwagFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class PoliwagFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Poliwag";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Poliwhirl");
    }

    @Override
    public int getEvolutionLevel() {
        return 25;
    }
}
