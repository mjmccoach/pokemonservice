package com.projectpokemon.pokemonservice.factory.dragonPokemon.dratiniFamily;

import com.projectpokemon.pokemonservice.factory.dragonPokemon.DragonPokemonInterface;

import java.util.List;

public class DratiniFactory implements DragonPokemonInterface {
    @Override
    public String supports() {
        return "Dratini";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Dragonair");
    }

    @Override
    public int getEvolutionLevel() {
        return 30;
    }
}
