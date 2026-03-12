package com.projectpokemon.pokemonservice.factory.ghostPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface GhostPokemonInterface extends Pokemon {
    default List<PokemonType> getGhostResistances() {
        return List.of(PokemonType.POISON, PokemonType.BUG);
    }
}
