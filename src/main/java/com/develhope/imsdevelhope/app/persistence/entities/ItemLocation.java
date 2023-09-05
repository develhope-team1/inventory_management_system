package com.develhope.imsdevelhope.app.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ITEM_LOCATION")
public class ItemLocation {
    public boolean addTransit;
    public boolean addWarehouse;
    public boolean addDelivered;
    @Id
    private Long id;

    public ItemLocation() {
    }

    public boolean isAddTransit() {
        return addTransit;
    }

    public void setAddTransit(boolean addTransit) {
        this.addTransit = addTransit;
    }

    public boolean isAddWarehouse() {
        return addWarehouse;
    }

    public void setAddWarehouse(boolean addWarehouse) {
        this.addWarehouse = addWarehouse;
    }

    public boolean isAddDelivered() {
        return addDelivered;
    }

    public void setAddDelivered(boolean addDelivered) {
        this.addDelivered = addDelivered;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
