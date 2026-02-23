package com.projectpokemon.pokemonservice.factory.fightingPokemon.hitmonchanFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class HitmonchanFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Hitmonchan";
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
