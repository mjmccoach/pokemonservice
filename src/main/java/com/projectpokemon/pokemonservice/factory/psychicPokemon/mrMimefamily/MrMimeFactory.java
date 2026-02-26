package com.projectpokemon.pokemonservice.factory.psychicPokemon.mrMimefamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class MrMimeFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Mr Mime";
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
