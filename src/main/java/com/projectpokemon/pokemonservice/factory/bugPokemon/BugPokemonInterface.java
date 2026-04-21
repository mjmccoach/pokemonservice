package com.projectpokemon.pokemonservice.factory.bugPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface BugPokemonInterface extends Pokemon {
    default List<PokemonType> getBugPokemonResistances() {
        return List.of(PokemonType.GRASS, PokemonType.FIGHTING, PokemonType.GROUND);
    }
}
