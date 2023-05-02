package com.example.demo;
import com.example.demo.Models.Beach;
import com.example.demo.Models.Creature;
import com.example.demo.Models.CreatureBeach;
import com.example.demo.Repositories.CreatureBeachRepository;
import com.example.demo.Repositories.CreatureRepository;
import com.example.demo.Repositories.BeachRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
class CapProjectApplicationTests {

	@Autowired
	CreatureRepository creatureRepository;

	@Autowired
	BeachRepository beachRepository;

	@Autowired
	CreatureBeachRepository creatureBeachRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateCreature(){
		Creature whelk = new Creature ("Snail", "Dogwhelk", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore", "Common");
		creatureRepository.save(whelk);
	}

	@Test
	public void canCreateBeach() {
		Beach beachTom = new Beach("Beach Tom", "-123.4, 567", "Tom, Is, Cool", "Tomvile", "The best beach in the world" );
		beachRepository.save(beachTom);
	}

	@Test
	public void canCreateCreatureBeach() {
		Creature whelk = new Creature ("Snail", "Dogwhelk", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore", "Common");
		creatureRepository.save(whelk);
		Beach beachTom = new Beach("Beach Tom", "-123.4, 567", "Tom, Is, Cool", "Tomvile", "The best beach in the world" );
		beachRepository.save(beachTom);
		CreatureBeach example1 = new CreatureBeach(whelk, beachTom);
		creatureBeachRepository.save(example1);
	}

}
