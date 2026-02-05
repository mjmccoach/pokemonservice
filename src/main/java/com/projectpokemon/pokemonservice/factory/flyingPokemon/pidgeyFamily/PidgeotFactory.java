package com.projectpokemon.pokemonservice.factory.flyingPokemon.pidgeyFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;

import java.util.List;

public class PidgeotFactory implements FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Pidgeot";
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
