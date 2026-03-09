package com.projectpokemon.pokemonservice.factory.rockPokemon.aerodactylFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.rockPokemon.RockPokemonInterface;

import java.util.List;

public class AerodactylFactory implements RockPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Aerodactyl";
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
