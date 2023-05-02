package com.example.demo.Repositories;
import com.example.demo.Models.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long> {
    public List<Creature> findAllByCreatureBeachesBeachId (Long id);
}


