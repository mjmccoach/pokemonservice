package com.projectpokemon.pokemonservice.factory.waterPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface WaterPokemonInterface extends Pokemon {
    default boolean canEvolveWithWaterStone() {
        return false;
    }

    @Override
    default List<PokemonType> getResistances() {
        return List.of(PokemonType.WATER, PokemonType.FIRE, PokemonType.ICE, PokemonType.STEEL);
    }
}
