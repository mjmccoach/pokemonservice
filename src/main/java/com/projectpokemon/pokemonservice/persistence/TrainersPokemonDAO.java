package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.persistence.rowmapper.TrainerPokemonRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TrainersPokemonDAO {

    private JdbcTemplate jdbcTemplate;
    private TrainerPokemonRowMapper rowMapper;

    public void getTrainersPokemonById() {

    }

    public void updateTrainersPokemonById() {
    }

    public void deleteTrainersPokemonById() {
    }
}
