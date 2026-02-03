package com.projectpokemon.pokemonservice.factory.grassPokemon;

import com.projectpokemon.pokemonservice.factory.Pokemon;

public interface GrassPokemonInterface extends Pokemon {
    default boolean canEvolveWithLeafStone() {
        return false;
    }
}
