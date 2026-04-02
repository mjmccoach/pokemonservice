package com.projectpokemon.pokemonservice.factory.dragonPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface DragonPokemonInterface extends Pokemon {
    default List<PokemonType> getDragonResistances() {
        return List.of(PokemonType.ELECTRIC, PokemonType.FIRE, PokemonType.WATER, PokemonType.GRASS);
    }
}
