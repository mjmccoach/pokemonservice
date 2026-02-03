package com.projectpokemon.pokemonservice.factory.firePokemon.charmanderFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class CharizardFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Charizard";
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
