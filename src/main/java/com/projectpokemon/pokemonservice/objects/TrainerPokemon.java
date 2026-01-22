package com.projectpokemon.pokemonservice.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TrainerPokemon {
    private int id;
    private int trainerId;
    private int level;
    private String nickname;
    private PokemonBase pokemonBase;
    private List<TrainerPokemonMove> moves;
}
