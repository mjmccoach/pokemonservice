package com.projectpokemon.pokemonservice.factory.flyingPokemon.spearowFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class SpearowFactory implements FlyingPokemonInterface, NormalPokemonInterface {
    @Override
    public String supports() {
        return "Spearow";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Fearow");
    }

    @Override
    public int getEvolutionLevel() {
        return 20;
    }
}
