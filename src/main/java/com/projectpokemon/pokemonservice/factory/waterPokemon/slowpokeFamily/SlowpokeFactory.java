package com.projectpokemon.pokemonservice.factory.waterPokemon.slowpokeFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class SlowpokeFactory implements WaterPokemonInterface, PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Slowpoke";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Slowbro");
    }

    @Override
    public int getEvolutionLevel() {
        return 37;
    }
}
