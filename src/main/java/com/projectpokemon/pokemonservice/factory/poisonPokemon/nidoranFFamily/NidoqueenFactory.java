package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranFFamily;

import com.projectpokemon.pokemonservice.factory.groundPokemon.GroundPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class NidoqueenFactory implements PoisonPokemonInterface, GroundPokemonInterface {
    @Override
    public String supports() {
        return "Nidoqueen";
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
