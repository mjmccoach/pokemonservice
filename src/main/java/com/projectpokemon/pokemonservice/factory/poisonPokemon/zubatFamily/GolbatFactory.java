package com.projectpokemon.pokemonservice.factory.poisonPokemon.zubatFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class GolbatFactory implements PoisonPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Golbat";
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
