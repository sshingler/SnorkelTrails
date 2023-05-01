package Models;

import java.util.ArrayList;

public abstract class Beach {
    private String name;
    private String map_cords;
    private String w3w;
    private String nearestVillage;
    private String description;
    private ArrayList<Creature> creatures;
    private ArrayList amenities;

    public Beach(String name, String map_cords, String w3w, String nearestVillage, String description, ArrayList<Creature> creatures, ArrayList amenities) {
        this.name = name;
        this.map_cords = map_cords;
        this.w3w = w3w;
        this.nearestVillage = nearestVillage;
        this.description = description;
        this.creatures = creatures;
        this.amenities = amenities;
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

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<Creature> creatures) {
        this.creatures = creatures;
    }

    public ArrayList getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayList amenities) {
        this.amenities = amenities;
    }
}
