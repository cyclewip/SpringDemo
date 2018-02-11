package co.edureka;

import java.util.List;

public class Room {
    private int nr;
    private String type;


    public Room(){

    }


    public Room(int nr, String type) {
        this.nr = nr;
        this.type = type;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
