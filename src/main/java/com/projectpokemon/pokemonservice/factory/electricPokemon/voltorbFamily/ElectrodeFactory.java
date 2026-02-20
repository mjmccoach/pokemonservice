package com.projectpokemon.pokemonservice.factory.electricPokemon.voltorbFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class ElectrodeFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Electrode";
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
