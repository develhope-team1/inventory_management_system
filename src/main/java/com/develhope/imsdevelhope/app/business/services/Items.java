package com.develhope.imsdevelhope.app.business.services;

public class Items {
    public Integer itemId;
    public String itemName;
    public boolean itemAvailable;
    public Integer itemStock;


    public Items(Integer itemId, String itemName, boolean itemAvailable, Integer itemStock) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemAvailable = itemAvailable;
        this.itemStock = itemStock;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isItemAvailable() {
        return itemAvailable;
    }

    public void setItemAvailable(boolean itemAvailable) {
        this.itemAvailable = itemAvailable;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemAvailable=" + itemAvailable +
                ", itemStock=" + itemStock +
                '}';
    }
}