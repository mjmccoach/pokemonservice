package com.projectpokemon.pokemonservice.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TrainerPokemonMove {
    private int trainerPokemonId;
    private int moveBaseId;
    private MoveBase moveBase;
    private int currentPP;
}
