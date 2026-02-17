package com.projectpokemon.pokemonservice.factory.waterPokemon.slowpokeFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class SlowbroFactory implements WaterPokemonInterface, PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Slowbro";
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
