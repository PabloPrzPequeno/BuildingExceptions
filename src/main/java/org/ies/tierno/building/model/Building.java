package org.ies.tierno.building.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.building.components.ApartamentNotFoundException;

import java.util.List;


@Data
@AllArgsConstructor
public class Building {
    private String address;
    private String city;
    private int zipCode;
    private List<Apartment> apartments;

    public Apartment getApartment(int floor, String door) throws ApartamentNotFoundException {
        for (Apartment apartment : apartments) {
            if (apartments.equals(floor) && apartments.equals(door)) {
                return apartment;
            }
        }
        throw new ApartamentNotFoundException(floor, door);
    }

    public Owner getOwners(int floor, String door) throws ApartamentNotFoundException {
        for (Apartment apartment : apartments) {
            for (Owner owner : apartment.getOwners()) {
                if (owner.equals(floor) && owner.equals(door)) {
                    return owner;
                }
            }
        }
        throw new ApartamentNotFoundException(floor, door);
    }
}
