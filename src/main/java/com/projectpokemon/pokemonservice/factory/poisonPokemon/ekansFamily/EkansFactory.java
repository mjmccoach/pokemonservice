package com.projectpokemon.pokemonservice.factory.poisonPokemon.ekansFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class EkansFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Ekans";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Arbok");
    }

    @Override
    public int getEvolutionLevel() {
        return 22;
    }
}
