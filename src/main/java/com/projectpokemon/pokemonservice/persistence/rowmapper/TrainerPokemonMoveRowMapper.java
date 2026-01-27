package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TrainerPokemonMoveRowMapper implements RowMapper<TrainerPokemonMove> {
    @Override
    public TrainerPokemonMove mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new TrainerPokemonMove(
                rs.getInt("trainer_pokemon_id"),
                rs.getInt("move_id"),
                null,
                rs.getInt("current_pp"));
    }
}
