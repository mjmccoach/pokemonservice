package com.projectpokemon.pokemonservice.factory.poisonPokemon.grimerFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class MukFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Muk";
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
