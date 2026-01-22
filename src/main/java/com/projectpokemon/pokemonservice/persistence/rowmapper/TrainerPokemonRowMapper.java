package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TrainerPokemonRowMapper implements RowMapper<TrainerPokemon> {
    @Override
    public TrainerPokemon mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new TrainerPokemon(
                rs.getInt("id"),
                rs.getInt("trainer_id"),
                rs.getInt("level"),
                rs.getString("nickname"),
                null,
                null);
    }
}
