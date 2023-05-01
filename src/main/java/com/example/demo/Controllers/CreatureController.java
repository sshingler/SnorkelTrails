package com.example.demo.Controllers;
import com.example.demo.Models.Creature;
import com.example.demo.Repositories.BeachRepository;
import com.example.demo.Repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CreatureController {

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    BeachRepository beachRepository;

    @GetMapping(value = "/creatures")
    public List<Creature> getAllCreatures(){
        return creatureRepository.findAll();
    }

    @GetMapping(value="/creatures/{id}")
    public Optional<Creature> getCreature(@PathVariable Long id){
        return creatureRepository.findById(id);
    }




}
