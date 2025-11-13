package com.projectpokemon.pokemonservice.objects;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UpdatePokemonBasePayload {

    private String name;
    private PokemonType primaryType;
    private PokemonType secondaryType;
}
