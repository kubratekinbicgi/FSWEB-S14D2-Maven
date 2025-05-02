package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 60, 1, 1);
        Lamp lamp = new Lamp(true, 80, LampType.NORMAL);
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);
        Carpet carpet = new Carpet(150, 200, PaintColor.RED);

        Room room = new Room("My Room", wall1, wall2, wall3, wall4, ceiling, lamp, wardrobe, carpet);

        Bedroom bedroom = new Bedroom(room, bed);

        bedroom.getRoom().getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getRoom().getCeiling().create();
        bedroom.getRoom().getCarpet().lying();
        bedroom.getRoom().getWardrobe().add();
        bedroom.getRoom().getWall1().create();

        }
}