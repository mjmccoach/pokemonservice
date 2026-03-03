package com.projectpokemon.pokemonservice.factory.normalPokemon.eeveeFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class VaporeonFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Vaporeon";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of();
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }
}
