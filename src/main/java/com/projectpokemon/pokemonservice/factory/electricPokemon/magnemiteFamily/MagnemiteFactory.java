package com.projectpokemon.pokemonservice.factory.electricPokemon.magnemiteFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class MagnemiteFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Magnemite";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Magneton");
    }

    @Override
    public int getEvolutionLevel() {
        return 30;
    }
}
