package com.projectpokemon.pokemonservice.factory.poisonPokemon;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public interface PoisonPokemonInterface extends Pokemon {
    default List<PokemonType> getPoisonResistances() {
        return List.of(PokemonType.GRASS, PokemonType.FIGHTING, PokemonType.POISON, PokemonType.BUG, PokemonType.FAIRY);
    }
}
