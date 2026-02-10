package com.projectpokemon.pokemonservice.factory.firePokemon.vulpixFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class VulpixFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Vulpix";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Ninetales");
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
    public StoneType getEvolutionStone() {
        return StoneType.FIRE;
    }
}
