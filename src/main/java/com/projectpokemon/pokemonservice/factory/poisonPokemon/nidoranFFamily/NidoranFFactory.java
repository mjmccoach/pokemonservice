package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranFFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class NidoranFFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "NidoranF";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Nidorina");
    }

    @Override
    public int getEvolutionLevel() {
        return 16;
    }
}
