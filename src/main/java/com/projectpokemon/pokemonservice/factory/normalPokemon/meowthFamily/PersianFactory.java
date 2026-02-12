package com.projectpokemon.pokemonservice.factory.normalPokemon.meowthFamily;

import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class PersianFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Persian";
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
