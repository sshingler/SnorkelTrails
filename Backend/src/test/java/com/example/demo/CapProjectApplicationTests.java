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
import java.util.Arrays;
import java.util.List;

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

		List<String> amenitiesClauchlandsFarm = Arrays.asList("Parking");
		Beach beachTom = new Beach("Arran", "image", "Beach Tom", "-123.4, 567", "Tom, Is, Cool", "", "Tomvile", "The best beach in the world", amenitiesClauchlandsFarm );
		beachRepository.save(beachTom);
	}

	@Test
	public void canCreateCreatureBeach() {

		Creature whelk = new Creature ("Snail", "Dogwhelk", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore", "Common");
		creatureRepository.save(whelk);
		List<String> amenitiesClauchlandsFarm = Arrays.asList("Parking");
		Beach beachTom = new Beach("Arran", "image", "Beach Tom", "-123.4, 567", "Tom, Is, Cool", "", "Tomvile", "The best beach in the world", amenitiesClauchlandsFarm );
		beachRepository.save(beachTom);
		CreatureBeach example1 = new CreatureBeach(whelk, beachTom);
		creatureBeachRepository.save(example1);
	}

}
