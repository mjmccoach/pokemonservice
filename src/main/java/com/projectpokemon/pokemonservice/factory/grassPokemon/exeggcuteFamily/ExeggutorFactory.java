package com.projectpokemon.pokemonservice.factory.grassPokemon.exeggcuteFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class ExeggutorFactory implements GrassPokemonInterface, PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Exeggutor";
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
