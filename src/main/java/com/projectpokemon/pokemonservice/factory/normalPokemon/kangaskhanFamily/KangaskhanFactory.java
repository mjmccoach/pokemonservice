package com.projectpokemon.pokemonservice.factory.normalPokemon.kangaskhanFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class KangaskhanFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Kangaskhan";
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
