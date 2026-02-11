package com.projectpokemon.pokemonservice.factory.groundPokemon.diglettFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;

import java.util.List;

public class DiglettFactory implements GroundPokemonInterface {
    @Override
    public String supports() {
        return "Diglett";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Dugtrio");
    }

    @Override
    public int getEvolutionLevel() {
        return 26;
    }
}
