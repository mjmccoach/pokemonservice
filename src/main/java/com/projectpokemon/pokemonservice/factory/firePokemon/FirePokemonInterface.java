package com.projectpokemon.pokemonservice.factory.firePokemon;

import com.projectpokemon.pokemonservice.factory.Pokemon;

public interface FirePokemonInterface extends Pokemon {
    default boolean canEvolveWithFireStone() {
        return false;
    }

}
