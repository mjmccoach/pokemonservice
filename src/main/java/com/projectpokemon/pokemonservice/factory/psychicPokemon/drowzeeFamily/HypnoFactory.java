package com.projectpokemon.pokemonservice.factory.psychicPokemon.drowzeeFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class HypnoFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Hypno";
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
