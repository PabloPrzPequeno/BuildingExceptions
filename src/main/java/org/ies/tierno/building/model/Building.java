package org.ies.tierno.building.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Building {
    private String address;
    private String city;
    private List<Apartment> apartments;
}
