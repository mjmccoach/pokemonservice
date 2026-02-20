package com.projectpokemon.pokemonservice.factory.grassPokemon.exeggcuteFamily;

import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class ExeggcutorFactory implements GrassPokemonInterface, PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Exeggcutor";
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
