package com.projectpokemon.pokemonservice.factory.ghostPokemon.gastlyFamily;

import com.projectpokemon.pokemonservice.factory.ghostPokemon.GhostPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class HaunterFactory implements GhostPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Haunter";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Gengar");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithTrade() {
        return true;
    }
}
