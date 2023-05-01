package Models;

import java.util.ArrayList;

public abstract class Creature {
    private String type;
    private String name;
    private String img;
    private String size;
    private String habitat;
    private String notes;
    private ArrayList<Beach> location;

    public Creature(String type, String name, String img, String size, String habitat, String notes, ArrayList<Beach> location) {
        this.type = type;
        this.name = name;
        this.img = img;
        this.size = size;
        this.habitat = habitat;
        this.notes = notes;
        this.location = location;
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
