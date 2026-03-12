package com.projectpokemon.pokemonservice.factory.flyingPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface FlyingPokemonInterface extends Pokemon {
    default List<PokemonType> getFlyingResistances() {
        return List.of(PokemonType.FIGHTING, PokemonType.BUG, PokemonType.GRASS);
    }
}
