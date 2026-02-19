package com.projectpokemon.pokemonservice.factory.ghostPokemon.gastlyFamily;

import com.projectpokemon.pokemonservice.factory.ghostPokemon.GhostPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class GastlyFactory implements GhostPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Gastly";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Haunter");
    }

    @Override
    public int getEvolutionLevel() {
        return 25;
    }
}
