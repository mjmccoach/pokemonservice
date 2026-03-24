package com.projectpokemon.pokemonservice.factory.firePokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface FirePokemonInterface extends Pokemon {
    default boolean canEvolveWithFireStone() {
        return false;
    }

    default List<PokemonType> getFireResistances() {
        return List.of(PokemonType.FIRE, PokemonType.GRASS, PokemonType.ICE, PokemonType.BUG, PokemonType.STEEL, PokemonType.FAIRY);
    }
}
