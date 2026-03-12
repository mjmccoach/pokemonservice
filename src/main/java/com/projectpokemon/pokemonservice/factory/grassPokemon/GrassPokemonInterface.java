package com.projectpokemon.pokemonservice.factory.grassPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface GrassPokemonInterface extends Pokemon {
    default boolean canEvolveWithLeafStone() {
        return false;
    }

    default List<PokemonType> getGrassResistances() {
        return List.of(PokemonType.WATER, PokemonType.ELECTRIC, PokemonType.GRASS, PokemonType.GROUND);
    }
}
