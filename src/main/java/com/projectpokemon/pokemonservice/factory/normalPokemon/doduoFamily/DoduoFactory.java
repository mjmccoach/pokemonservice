package com.projectpokemon.pokemonservice.factory.normalPokemon.doduoFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class DoduoFactory implements NormalPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Doduo";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Dodrio");
    }

    @Override
    public int getEvolutionLevel() {
        return 31;
    }
}
