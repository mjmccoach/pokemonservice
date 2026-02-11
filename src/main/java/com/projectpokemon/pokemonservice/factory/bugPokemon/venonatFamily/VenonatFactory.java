package com.projectpokemon.pokemonservice.factory.bugPokemon.venonatFamily;

import com.projectpokemon.pokemonservice.factory.bugPokemon.BugPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class VenonatFactory implements BugPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Venonat";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Venomoth");
    }

    @Override
    public int getEvolutionLevel() {
        return 31;
    }
}
