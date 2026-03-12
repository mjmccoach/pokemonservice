package com.projectpokemon.pokemonservice.factory.groundPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface GroundPokemonInterface extends Pokemon {
    default List<PokemonType> getGroundResistances() {
        return List.of(PokemonType.POISON, PokemonType.ROCK);
    }
}
