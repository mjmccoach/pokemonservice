package com.projectpokemon.pokemonservice.objects;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class MoveBase {
    private int id;
    private String name;
    private PokemonType pokemonType;
    private int pp;
}
