package com.projectpokemon.pokemonservice.factory.ghostPokemon.gastlyFamily;

import com.projectpokemon.pokemonservice.factory.ghostPokemon.GhostPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class GengarFactory implements GhostPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Gengar";
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
