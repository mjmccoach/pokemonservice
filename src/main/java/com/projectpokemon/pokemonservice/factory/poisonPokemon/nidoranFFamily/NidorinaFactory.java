package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranFFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class NidorinaFactory implements PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Nidorina";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Nidoqueen");
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
