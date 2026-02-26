package com.projectpokemon.pokemonservice.factory.icePokemon.jynxFamily;

import com.projectpokemon.pokemonservice.factory.icePokemon.IcePokemonInterface;
import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class JynxFactory implements IcePokemonInterface, PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Jynx";
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
