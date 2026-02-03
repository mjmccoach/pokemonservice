package com.projectpokemon.pokemonservice.factory.firePokemon.charmanderFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class CharmanderFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Charmander";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Charmeleon");
    }

    @Override
    public int getEvolutionLevel() {
        return 16;
    }
}
