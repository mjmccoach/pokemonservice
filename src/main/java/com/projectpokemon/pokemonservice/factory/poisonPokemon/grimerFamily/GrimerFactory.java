package com.projectpokemon.pokemonservice.factory.poisonPokemon.grimerFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class GrimerFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Grimer";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Muk");
    }

    @Override
    public int getEvolutionLevel() {
        return 38;
    }
}
