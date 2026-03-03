package com.projectpokemon.pokemonservice.factory.normalPokemon.eeveeFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class JolteonFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Jolteon";
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
