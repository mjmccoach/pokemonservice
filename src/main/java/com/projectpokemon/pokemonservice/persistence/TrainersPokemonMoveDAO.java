package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
import com.projectpokemon.pokemonservice.persistence.rowmapper.TrainerPokemonMoveRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TrainersPokemonMoveDAO {
    private static final String INSERT = "INSERT into trainer_pokemon_moves VALUES (%s, %s, %s)";
    private static final String DELETE = "DELETE from trainer_pokemon_moves WHERE trainer_pokemon_id = ? AND move_id = ?";
    private static final String UPDATE = "UPDATE trainer_pokemon_moves SET current_pp = %s WHERE trainer_pokemon_id = ? and move_id =?";
    private static final String SELECT_ALL = "SELECT * from trainer_pokemon_moves WHERE trainer_pokemon_id = ?";
    
    private JdbcTemplate jdbcTemplate;
    private TrainerPokemonMoveRowMapper trainerPokemonMoveRowMapper;

    public void createTrainerPokemonMove(int trainerPokemonId, int moveId, int currentPP) {
        jdbcTemplate.execute(String.format(INSERT, trainerPokemonId, moveId, currentPP));
    }

    public void deleteTrainerPokemonMove(int trainerPokemonId, int moveId) {
        jdbcTemplate.update(DELETE, trainerPokemonId, moveId);
    }

    public void updateTrainerPokemonMove(int newPp, int trainerPokemonId, int moveId) {
        jdbcTemplate.update(UPDATE, newPp, trainerPokemonId, moveId);
    }

    public List<TrainerPokemonMove> getAllTrainerPokemonMoves(int trainerPokemonId, int moveId) {
        return jdbcTemplate.query(SELECT_ALL, trainerPokemonMoveRowMapper, trainerPokemonId, moveId);
    }
}
