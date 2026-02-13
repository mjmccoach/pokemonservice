package com.projectpokemon.pokemonservice.factory.waterPokemon.poliwagFamily;

import com.projectpokemon.pokemonservice.factory.fightingPokemon.FightingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class PoliwrathFactory implements WaterPokemonInterface, FightingPokemonInterface {
    @Override
    public String supports() {
        return "Poliwrath";
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
