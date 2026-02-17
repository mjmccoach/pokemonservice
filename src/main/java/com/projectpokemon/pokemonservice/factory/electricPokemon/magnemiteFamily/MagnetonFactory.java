package com.projectpokemon.pokemonservice.factory.electricPokemon.magnemiteFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class MagnetonFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Magneton";
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
