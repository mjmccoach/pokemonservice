package com.projectpokemon.pokemonservice.factory.psychicPokemon.abraFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class AbraFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Abra";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Kadabra");
    }

    @Override
    public int getEvolutionLevel() {
        return 16;
    }
}
