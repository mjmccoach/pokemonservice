package com.projectpokemon.pokemonservice.factory.fightingPokemon.hitmonleeFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class HitmonleeFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Hitmonlee";
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
