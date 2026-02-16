package com.projectpokemon.pokemonservice.factory.psychicPokemon.abraFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class AlakazamFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Alakazam";
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
