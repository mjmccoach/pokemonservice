package com.projectpokemon.pokemonservice.factory.grassPokemon.exeggcuteFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.psychicPokemon.PsychicPokemonInterface;

import java.util.List;

public class ExeggcuteFactory implements GrassPokemonInterface, PsychicPokemonInterface {
    @Override
    public String supports() {
        return "Exeggcute";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Exeggutor");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithStone() {
        return true;
    }

    @Override
    public List<StoneType> getEvolutionStone() {
        return List.of(StoneType.LEAF);
    }
}
