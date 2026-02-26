package com.projectpokemon.pokemonservice.factory.electricPokemon.electabuzzFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class ElectabuzzFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Electabuzz";
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
