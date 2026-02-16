package com.projectpokemon.pokemonservice.factory.fightingPokemon.machopFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;

import java.util.List;

public class MachokeFactory implements FightingPokemonInterface {
    @Override
    public String supports() {
        return "Machoke";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Machamp");
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
