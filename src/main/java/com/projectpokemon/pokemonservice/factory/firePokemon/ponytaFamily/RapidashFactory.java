package com.projectpokemon.pokemonservice.factory.firePokemon.ponytaFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class RapidashFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Rapidash";
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
