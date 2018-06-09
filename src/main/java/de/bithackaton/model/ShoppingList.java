package de.bithackaton.model;

import org.geojson.Point;

import java.util.List;

/**
 * bITHackaton2018
 * Author: tsteidle
 * Created: 08.06.18
 */
public class ShoppingList {

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    private Point currentLocation;

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    private String items;

    @Override
    public String toString() {
        return "ShoppingList{" +
                "currentLocation=" + currentLocation +
                ", items='" + items + '\'' +
                '}';
    }
}
