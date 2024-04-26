package org.ies.tierno.building.components;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApartamentNotFoundException extends Exception {
    private int floor;
    private String door;
}
