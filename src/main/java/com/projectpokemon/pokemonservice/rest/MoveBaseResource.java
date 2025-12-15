package com.projectpokemon.pokemonservice.rest;

import com.projectpokemon.pokemonservice.objects.MoveBase;
import com.projectpokemon.pokemonservice.service.MoveBaseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/moves")
@AllArgsConstructor
public class MoveBaseResource {

    private MoveBaseService moveBaseService;

    @GetMapping("/{id}")
    public MoveBase getMoveBaseById(int id) {
        return moveBaseService.getMoveBaseById(id);
    }

    @GetMapping("/{type}")
    public List<MoveBase> getMoveBaseByType(String type) {
        return moveBaseService.getMoveBaseByType(type);
    }

    @GetMapping("/all")
    public List<MoveBase> getAllMoves() {
        return moveBaseService.getAllMoveBases();
    }
}
