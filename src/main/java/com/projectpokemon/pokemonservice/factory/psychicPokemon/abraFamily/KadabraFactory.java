package com.projectpokemon.pokemonservice.factory.psychicPokemon.abraFamily;

import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class KadabraFactory implements PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Kadabra";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Alakazam");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithTrade() {
        return true;
    }
}
