package com.example.demo.Controllers;
import com.example.demo.Models.Beach;
import com.example.demo.Repositories.BeachRepository;
import com.example.demo.Repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BeachController {

    @Autowired
    BeachRepository beachRepository;

    @Autowired
    CreatureRepository creatureRepository;

    @GetMapping(value = "/beaches")
    public List<Beach> getAllBeaches() {
        return beachRepository.findAll();
    }

    @GetMapping(value="/beaches/{id}")
    public Optional<Beach> getBeach(@PathVariable Long id){
        return beachRepository.findById(id);
    }
}
