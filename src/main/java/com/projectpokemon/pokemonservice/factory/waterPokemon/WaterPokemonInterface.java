package com.projectpokemon.pokemonservice.factory.waterPokemon;

import com.projectpokemon.pokemonservice.factory.Pokemon;

public interface WaterPokemonInterface extends Pokemon {
    default boolean canEvolveWithWaterStone() {
        return false;
    }

    ;
}
