package com.example.demo.Repositories;
import com.example.demo.Models.CreatureBeach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreatureBeachRepository extends JpaRepository<CreatureBeach, Long> {

}