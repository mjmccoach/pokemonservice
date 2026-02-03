package com.projectpokemon.pokemonservice.factory.grassPokemon.bulbasaurFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;

import java.util.List;

public class BulbasaurFactory implements GrassPokemonInterface {
    @Override
    public String supports() {
        return "Bulbasaur";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Ivysaur");
    }

    @Override
    public int getEvolutionLevel() {
        return 16;
    }
}
