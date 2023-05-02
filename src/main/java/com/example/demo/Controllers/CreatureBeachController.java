package com.example.demo.Controllers;
import com.example.demo.Models.Creature;
import com.example.demo.Models.CreatureBeach;
import com.example.demo.Repositories.BeachRepository;
import com.example.demo.Repositories.CreatureBeachRepository;
import com.example.demo.Repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CreatureBeachController {

    @Autowired
    CreatureBeachRepository creatureBeachRepository;

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    BeachRepository beachRepository;

    @GetMapping(value = "/creaturebeaches")
    public List<CreatureBeach> getAllCreatureBeaches(){
        return creatureBeachRepository.findAll();
    }

    @GetMapping(value="/creaturebeaches/{id}")
    public Optional<CreatureBeach> getCreatureBeach(@PathVariable Long id){
        return creatureBeachRepository.findById(id);
    }




}