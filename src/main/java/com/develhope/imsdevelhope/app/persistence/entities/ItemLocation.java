package com.develhope.imsdevelhope.app.persistence.entities;

public class ItemLocation {
    public boolean addTransit;
    public boolean addWarehouse;
    public boolean addDelivered;

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
}
