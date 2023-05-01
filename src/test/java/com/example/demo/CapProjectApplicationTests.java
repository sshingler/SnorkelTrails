package com.example.demo;
import com.example.demo.Models.Creature;
import com.example.demo.Repositories.CreatureRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
class CapProjectApplicationTests {

	@Autowired
	CreatureRepository creatureRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateCreature(){
		Creature whelk = new Creature ("Snail", "Dogwhelk", "DogWhelk.jpeg", "3 - 6cm", "Found on the lower shore", "Common");
		creatureRepository.save(whelk);
	}
}
