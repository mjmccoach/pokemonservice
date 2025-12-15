package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.MoveBase;
import com.projectpokemon.pokemonservice.persistence.MoveBaseDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MoveBaseService {
    private MoveBaseDAO moveBaseDAO;

    public MoveBase getMoveBaseById(int id) {
        return moveBaseDAO.getMoveBaseById(id);
    }

    public List<MoveBase> getMoveBaseByType(String type) {
        return moveBaseDAO.getMoveBaseByType(type);
    }

    public List<MoveBase> getAllMoveBases() {
        return moveBaseDAO.getAllMoves();
    }
}
