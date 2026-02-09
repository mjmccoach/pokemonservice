package com.projectpokemon.pokemonservice.factory.electricPokemon;

import com.projectpokemon.pokemonservice.factory.Pokemon;

public interface ElectricPokemonInterface extends Pokemon {

    default boolean evolvesWithThunderStone() {
        return false;
    }
}
