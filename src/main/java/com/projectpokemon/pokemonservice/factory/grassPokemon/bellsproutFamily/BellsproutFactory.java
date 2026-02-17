package com.projectpokemon.pokemonservice.factory.grassPokemon.bellsproutFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class BellsproutFactory implements GrassPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Bellsprout";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Weepinbell");
    }

    @Override
    public int getEvolutionLevel() {
        return 21;
    }
}
