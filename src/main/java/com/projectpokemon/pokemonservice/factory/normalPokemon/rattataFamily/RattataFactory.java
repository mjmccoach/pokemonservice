package com.projectpokemon.pokemonservice.factory.normalPokemon.rattataFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class RattataFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Rattata";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Raticate");
    }

    @Override
    public int getEvolutionLevel() {
        return 20;
    }
}
