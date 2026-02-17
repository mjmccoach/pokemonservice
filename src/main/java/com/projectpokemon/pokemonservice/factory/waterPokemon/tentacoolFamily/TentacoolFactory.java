package com.projectpokemon.pokemonservice.factory.waterPokemon.tentacoolFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class TentacoolFactory implements WaterPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Tentacool";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Tentacruel");
    }

    @Override
    public int getEvolutionLevel() {
        return 30;
    }
}
