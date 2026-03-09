package com.projectpokemon.pokemonservice.factory.dragonPokemon.dratiniFamily;

import com.projectpokemon.pokemonservice.factory.dragonPokemon.DragonPokemonInterface;

import java.util.List;

public class DragonairFactory implements DragonPokemonInterface {
    @Override
    public String supports() {
        return "Dragonair";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Dragonite");
    }

    @Override
    public int getEvolutionLevel() {
        return 55;
    }
}
