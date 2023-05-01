package Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Beaches")
public class Beach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private List<CreatureBeaches> creatureBeaches;

    @Column (name="amenities")
    private ArrayList amenities;

    public Beach(String name, String map_cords, String w3w, String nearestVillage, String description, ArrayList<Creature> creatures, ArrayList amenities) {
        this.name = name;
        this.map_cords = map_cords;
        this.w3w = w3w;
        this.nearestVillage = nearestVillage;
        this.description = description;
        this.creatureBeaches = new ArrayList<CreatureBeach>();
        this.amenities = amenities;
    }

    public Beach() {
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
