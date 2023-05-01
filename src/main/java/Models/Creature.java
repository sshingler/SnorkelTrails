package Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Creatures")
public class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "img")
    private String img;

    @Column(name = "size")
    private String size;

    @Column(name = "habitat")
    private String habitat;

    @Column(name = "notes")
    private String notes;

    @JsonIgnoreProperties({"creature"})
    @OneToMany(mappedBy = "creature", fetch = FetchType.LAZY)
    private List<CreatureBeach> creatureBeaches;

    public Creature(String type, String name, String img, String size, String habitat, String notes, ArrayList<Beach> location) {
        this.type = type;
        this.name = name;
        this.img = img;
        this.size = size;
        this.habitat = habitat;
        this.notes = notes;
        this.creatureBeaches = new ArrayList<CreatureBeach>();
    }

    public Creature() {

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<Beach> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Beach> location) {
        this.location = location;
    }
}
