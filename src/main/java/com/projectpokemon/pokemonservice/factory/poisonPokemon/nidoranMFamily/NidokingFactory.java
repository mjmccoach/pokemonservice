package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranMFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class NidokingFactory implements PoisonPokemonInterface, GroundPokemonInterface {
    @Override
    public String supports() {
        return "Nidoking";
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
