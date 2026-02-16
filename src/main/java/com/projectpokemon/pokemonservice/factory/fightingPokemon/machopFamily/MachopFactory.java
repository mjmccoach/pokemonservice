package com.projectpokemon.pokemonservice.factory.fightingPokemon.machopFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class MachopFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Machop";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Machoke");
    }

    @Override
    public int getEvolutionLevel() {
        return 28;
    }
}
