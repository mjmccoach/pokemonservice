package com.projectpokemon.pokemonservice.factory.electricPokemon.pikachuFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class RaichuFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Raichu";
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
