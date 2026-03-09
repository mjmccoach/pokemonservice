package com.projectpokemon.pokemonservice.factory.firePokemon.moltresFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;
import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;

import java.util.List;

public class MoltresFactory implements FirePokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Moltres";
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
