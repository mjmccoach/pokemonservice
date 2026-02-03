package com.projectpokemon.pokemonservice.factory.waterPokemon.squirtleFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class BlastoiseFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Blastoise";
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
