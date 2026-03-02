package com.projectpokemon.pokemonservice.factory.firePokemon.magmarFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class MagmarFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Magmar";
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
