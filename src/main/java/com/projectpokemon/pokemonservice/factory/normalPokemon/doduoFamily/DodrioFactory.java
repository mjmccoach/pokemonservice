package com.projectpokemon.pokemonservice.factory.normalPokemon.doduoFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class DodrioFactory implements NormalPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Dodrio";
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
