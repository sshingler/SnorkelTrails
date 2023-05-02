package com.example.demo.Repositories;
import com.example.demo.Models.Beach;
import com.example.demo.Models.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeachRepository extends JpaRepository <Beach, Long> {
    public List<Beach> findAllByCreatureBeachesCreatureId (Long id);

}
