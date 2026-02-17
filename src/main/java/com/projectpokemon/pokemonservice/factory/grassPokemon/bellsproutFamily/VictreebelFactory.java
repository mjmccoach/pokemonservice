package com.projectpokemon.pokemonservice.factory.grassPokemon.bellsproutFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class VictreebelFactory implements GrassPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Victreebel";
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
