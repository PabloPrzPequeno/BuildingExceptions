package org.ies.tierno.building.components;

import org.ies.tierno.building.model.Owner;

public class OwnerReader implements Reader<Owner> {

    @Override
    public Owner read() {
        return new Owner("Bob", "Esponja");
    }
}
