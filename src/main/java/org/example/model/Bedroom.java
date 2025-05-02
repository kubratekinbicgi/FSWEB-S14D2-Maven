package org.example.model;

public class Bedroom {
    private Room room;
    private Bed bed;


    public Room getRoom() {
        return room;
    }

    public Bed getBed() {
        return bed;
    }

    public Bedroom(Room room, Bed bed) {

        this.bed = bed;
        this.room = room;


    }
}
