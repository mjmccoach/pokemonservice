package com.projectpokemon.pokemonservice.factory.waterPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.Collections;
import java.util.List;

public interface WaterPokemonInterface extends Pokemon {
    List<PokemonType> resistances = Collections.emptyList();

    default boolean canEvolveWithWaterStone() {
        return false;
    }

    default List<PokemonType> getWaterResistances() {
        return List.of(PokemonType.WATER, PokemonType.FIRE, PokemonType.ICE, PokemonType.STEEL);
    }
}
