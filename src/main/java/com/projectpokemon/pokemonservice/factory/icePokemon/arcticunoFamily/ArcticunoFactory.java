package com.projectpokemon.pokemonservice.factory.icePokemon.arcticunoFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.icePokemon.IcePokemonInterface;

import java.util.List;

public class ArcticunoFactory implements IcePokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Arcticuno";
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
