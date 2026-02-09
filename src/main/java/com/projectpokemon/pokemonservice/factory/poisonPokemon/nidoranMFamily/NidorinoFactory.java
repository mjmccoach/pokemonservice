package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranMFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class NidorinoFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Nidorino";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Nidoking");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithStone() {
        return true;
    }

    public StoneType getEvolutionStone() {
        return StoneType.MOON;
    }
}
