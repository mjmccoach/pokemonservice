package com.projectpokemon.pokemonservice.factory.psychicPokemon.drowzeeFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class DrowzeeFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Drowzee";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Hypno");
    }

    @Override
    public int getEvolutionLevel() {
        return 26;
    }
}
