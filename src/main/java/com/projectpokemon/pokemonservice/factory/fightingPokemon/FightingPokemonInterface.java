package com.projectpokemon.pokemonservice.factory.fightingPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface FightingPokemonInterface extends Pokemon {
    default List<PokemonType> getFightingResistances() {
        return List.of(PokemonType.BUG, PokemonType.ROCK, PokemonType.DARK);
    }
}
