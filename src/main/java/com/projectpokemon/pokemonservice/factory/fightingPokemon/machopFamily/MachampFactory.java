package com.projectpokemon.pokemonservice.factory.fightingPokemon.machopFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class MachampFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Machamp";
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
