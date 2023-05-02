package com.example.demo.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="beaches")
public class Beach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "Location")
    private String location;

    @Column ( name= "image")
    private String image;

    @Column(name = "name")
    private String name;

    @Column (name= "map_cords")
    private String map_cords;

    @Column (name = "w3w")
    private String w3w;

    @Column (name= "nearest_village")
    private String nearestVillage;

    @Column (name = "description")
    private String description;

    @JsonIgnoreProperties({"beach"})
    @OneToMany(mappedBy = "beach", fetch = FetchType.LAZY)
    private List<CreatureBeach> creatureBeaches;

    @Column (name="amenities")
    private List<Integer> amenities;

    public Beach(String location, String image, String name, String map_cords, String w3w, String nearestVillage, String description) {
        this.location = location;
        this.image = image;
        this.name = name;
        this.map_cords = map_cords;
        this.w3w = w3w;
        this.nearestVillage = nearestVillage;
        this.description = description;
        this.creatureBeaches = new ArrayList<>();
        this.amenities = new ArrayList<>();
    }

    public Beach() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap_cords() {
        return map_cords;
    }

    public void setMap_cords(String map_cords) {
        this.map_cords = map_cords;
    }

    public String getW3w() {
        return w3w;
    }

    public void setW3w(String w3w) {
        this.w3w = w3w;
    }

    public String getNearestVillage() {
        return nearestVillage;
    }

    public void setNearestVillage(String nearestVillage) {
        this.nearestVillage = nearestVillage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CreatureBeach> getCreatureBeaches() {
        return creatureBeaches;
    }

    public void setCreatureBeaches (List<CreatureBeach> creatureBeaches) {
        this.creatureBeaches = creatureBeaches;
    }

    public void addCreatureBeach (CreatureBeach creatureBeach) {
        this.creatureBeaches.add(creatureBeach);
    }

    public List<Integer> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Integer> amenities) {
        this.amenities = amenities;
    }
}
