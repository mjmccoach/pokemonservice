package com.projectpokemon.pokemonservice.factory.firePokemon.vulpixFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class NinetalesFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Ninetales";
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
