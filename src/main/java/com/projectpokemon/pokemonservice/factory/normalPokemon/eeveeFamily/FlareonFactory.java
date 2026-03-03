package com.projectpokemon.pokemonservice.factory.normalPokemon.eeveeFamily;

import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class FlareonFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Flareon";
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
