package com.projectpokemon.pokemonservice.factory.poisonPokemon.zubatFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class ZubatFactory implements PoisonPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Zubat";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Golbat");
    }

    @Override
    public int getEvolutionLevel() {
        return 22;
    }
}
