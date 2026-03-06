package com.projectpokemon.pokemonservice.factory.normalPokemon.porygonFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class PorygonFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Porygon";
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
