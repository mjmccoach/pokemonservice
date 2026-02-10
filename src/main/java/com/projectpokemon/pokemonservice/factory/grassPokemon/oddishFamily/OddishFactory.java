package com.projectpokemon.pokemonservice.factory.grassPokemon.oddishFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class OddishFactory implements GrassPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Oddish";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Gloom");
    }

    @Override
    public int getEvolutionLevel() {
        return 21;
    }
}
