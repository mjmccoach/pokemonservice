package com.projectpokemon.pokemonservice.factory.rockPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface RockPokemonInterface extends Pokemon {
    default List<PokemonType> getRockResistances() {
        return List.of(PokemonType.NORMAL, PokemonType.FIRE, PokemonType.POISON, PokemonType.FLYING);
    }
}
