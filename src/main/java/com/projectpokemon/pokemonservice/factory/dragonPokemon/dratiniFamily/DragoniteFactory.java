package com.projectpokemon.pokemonservice.factory.dragonPokemon.dratiniFamily;

import com.projectpokemon.pokemonservice.factory.dragonPokemon.DragonPokemonInterface;

import java.util.List;

public class DragoniteFactory implements DragonPokemonInterface {
    @Override
    public String supports() {
        return "Dragonite";
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
