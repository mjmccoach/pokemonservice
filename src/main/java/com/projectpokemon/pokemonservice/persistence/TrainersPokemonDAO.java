package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.persistence.rowmapper.TrainerPokemonRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TrainersPokemonDAO {

    private static final String SELECT_BY_ID = "SELECT * from TrainersPokemon WHERE trainerId = ?";
    private static final String UPDATE_BY_ID = "UPDATE TrainersPokemon" +
            "                                   SET nickname = '%s' " +
            "                                   SET level = '%s' " +
            "                                   WHERE id = %s AND trainer_id = %s";
    private static final String DELETE_BY_ID = "DELETE from TrainersPokemon WHERE id = ? AND trainer_id = ?";


    private JdbcTemplate jdbcTemplate;
    private TrainerPokemonRowMapper rowMapper;

    public List<TrainerPokemon> getTrainersPokemonById(int trainerId) {
        return jdbcTemplate.query(SELECT_BY_ID, rowMapper, trainerId);
    }

    public void updateTrainersPokemonById(String nickname, int level, int id, int trainerId) {
        jdbcTemplate.update(String.format(UPDATE_BY_ID, nickname, level, id, trainerId));
    }

    public void deleteTrainersPokemonById(int id, int trainerId) {
        jdbcTemplate.update(DELETE_BY_ID, id, trainerId);
    }
}
