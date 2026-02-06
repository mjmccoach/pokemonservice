package com.projectpokemon.pokemonservice.factory.flyingPokemon.spearowFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class FearowFactory implements FlyingPokemonInterface, NormalPokemonInterface {
    @Override
    public String supports() {
        return "Fearow";
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
