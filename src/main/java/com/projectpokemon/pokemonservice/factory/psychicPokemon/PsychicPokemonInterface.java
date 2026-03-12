package com.projectpokemon.pokemonservice.factory.psychicPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface PsychicPokemonInterface extends Pokemon {
    default List<PokemonType> getPsychicResistances() {
        return List.of(PokemonType.FIGHTING, PokemonType.PSYCHIC);
    }
}
