package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranMFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class NidoranMFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "NidoranM";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Nidorino");
    }

    @Override
    public int getEvolutionLevel() {
        return 16;
    }
}
