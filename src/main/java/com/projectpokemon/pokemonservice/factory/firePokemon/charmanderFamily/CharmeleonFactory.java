package com.projectpokemon.pokemonservice.factory.firePokemon.charmanderFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class CharmeleonFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Charmeleon";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Charizard");
    }

    @Override
    public int getEvolutionLevel() {
        return 36;
    }
}
