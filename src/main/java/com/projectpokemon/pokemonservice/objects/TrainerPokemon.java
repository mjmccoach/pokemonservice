package com.projectpokemon.pokemonservice.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TrainerPokemon {
    private int id;
    private int level;
    private String nickname;
    private PokemonBase pokemonBase;
}
