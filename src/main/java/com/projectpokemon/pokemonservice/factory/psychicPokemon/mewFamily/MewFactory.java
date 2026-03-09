package com.projectpokemon.pokemonservice.factory.psychicPokemon.mewFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class MewFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Mew";
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
