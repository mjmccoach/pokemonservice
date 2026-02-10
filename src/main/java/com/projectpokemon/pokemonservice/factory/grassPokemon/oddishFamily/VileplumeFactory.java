package com.projectpokemon.pokemonservice.factory.grassPokemon.oddishFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class VileplumeFactory implements GrassPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Vileplume";
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
