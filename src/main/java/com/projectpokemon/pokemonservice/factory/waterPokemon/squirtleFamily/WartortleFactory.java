package com.projectpokemon.pokemonservice.factory.waterPokemon.squirtleFamily;

import com.projectpokemon.pokemonservice.factory.Pokemon;

import java.util.List;

public class WartortleFactory implements Pokemon {
    @Override
    public String supports() {
        return "Wartortle";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Blastoise");
    }

    @Override
    public int getEvolutionLevel() {
        return 36;
    }
}
