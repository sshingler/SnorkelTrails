package Controllers;

import Repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatureController {


    @Autowired
    CreatureRepository creatureRepository;

    public List<Creature> getAllCreatures(){
        return creatureRepository.findAll();
    }
}
