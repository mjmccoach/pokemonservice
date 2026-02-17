package com.projectpokemon.pokemonservice.factory.firePokemon.ponytaFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class PonytaFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Ponyta";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Rapidash");
    }

    @Override
    public int getEvolutionLevel() {
        return 40;
    }
}
