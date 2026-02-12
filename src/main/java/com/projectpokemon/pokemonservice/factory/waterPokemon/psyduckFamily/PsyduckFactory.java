package com.projectpokemon.pokemonservice.factory.waterPokemon.psyduckFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class PsyduckFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Psyduck";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Golduck");
    }

    @Override
    public int getEvolutionLevel() {
        return 33;
    }
}
