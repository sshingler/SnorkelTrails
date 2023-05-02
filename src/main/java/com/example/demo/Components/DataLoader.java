package com.example.demo.Components;

import com.example.demo.Models.Beach;
import com.example.demo.Models.Creature;
import com.example.demo.Models.CreatureBeach;
import com.example.demo.Repositories.BeachRepository;
import com.example.demo.Repositories.CreatureBeachRepository;
import com.example.demo.Repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BeachRepository beachRepository;

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    CreatureBeachRepository creatureBeachRepository;

    public DataLoader (){

    }

    public void run(ApplicationArguments args) {

        Creature creature1 = new Creature("Snail2", "Dogwhelk2", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore", "Common");
        creatureRepository.save(creature1);

        Creature creature2 = new Creature("Snail3", "Dogwhelk3", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore", "Common");
        creatureRepository.save(creature2);

        Beach beach1 = new Beach ("Beach Tom2", "-123.4, 567", "Tom, Is, Cool", "Tomvile", "The best beach in the world");
        beachRepository.save(beach1);

//        Creature[] creatures = { creature1, creature2};
//        List<Creature> creatureList = Arrays.asList(creatures);
//
//        CreatureBeach creatureBeach1 = new CreatureBeach(creatureList, beach1);
//        creatureBeachRepository.save(creatureBeach1);
    }
}
