package com.projectpokemon.pokemonservice.factory.grassPokemon.bulbasaurFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;

import java.util.List;

public class VenusaurFactory implements GrassPokemonInterface {
    @Override
    public String supports() {
        return "Venusaur";
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
