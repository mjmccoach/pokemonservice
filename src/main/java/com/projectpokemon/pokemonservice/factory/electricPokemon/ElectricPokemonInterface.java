package com.projectpokemon.pokemonservice.factory.electricPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface ElectricPokemonInterface extends Pokemon {

    default boolean evolvesWithThunderStone() {
        return false;
    }

    default List<PokemonType> getElectricResistances() {
        return List.of(PokemonType.ELECTRIC, PokemonType.STEEL, PokemonType.FLYING);
    }
}
