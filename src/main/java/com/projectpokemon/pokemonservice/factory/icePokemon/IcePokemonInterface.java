package com.projectpokemon.pokemonservice.factory.icePokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface IcePokemonInterface extends Pokemon {
    default List<PokemonType> getIceResistances() {
        return List.of(PokemonType.ICE);
    }
}
