package com.projectpokemon.pokemonservice.factory.grassPokemon.bulbasaurFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;

import java.util.List;

public class IvysaurFactory implements GrassPokemonInterface {
    @Override
    public String supports() {
        return "Ivysaur";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Venusaur");
    }

    @Override
    public int getEvolutionLevel() {
        return 32;
    }
}
