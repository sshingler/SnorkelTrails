package com.example.demo.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "creatureBeaches")
public class CreatureBeach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"creatureBeaches"})
    @JoinColumn( name = "creature_id", nullable = false)
    private Creature creature;

    @ManyToOne
    @JsonIgnoreProperties({"creatureBeaches"})
    @JoinColumn(name = "beach_id", nullable = false)
    private Beach beach;

    public CreatureBeach (Creature creature, Beach beach){
        this.creature = creature;
        this.beach = beach;
    }

    public CreatureBeach () {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Creature getCreature() {
        return (Creature) creature;
    }

    public void setCreature(Creature creature) {
        this.creature = CreatureBeach.this.creature;
    }

    public Beach getBeach() {
        return beach;
    }

    public void setBeach(Beach beach) {
        this.beach = beach;
    }


}
