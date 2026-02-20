package com.projectpokemon.pokemonservice.factory.electricPokemon.voltorbFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class VoltorbFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Voltorb";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Electrode");
    }

    @Override
    public int getEvolutionLevel() {
        return 30;
    }
}
