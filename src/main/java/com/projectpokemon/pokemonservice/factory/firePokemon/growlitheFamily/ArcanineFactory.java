package com.projectpokemon.pokemonservice.factory.firePokemon.growlitheFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class ArcanineFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Arcanine";
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
