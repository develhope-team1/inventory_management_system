package com.develhope.imsdevelhope.app.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ITEMS")
public class Items {
    public Integer itemId;
    public String itemName;
    public boolean itemAvailable;
    public Integer itemStock;
    @Id
    private Long id;


    public Items(Integer itemId, String itemName, boolean itemAvailable, Integer itemStock) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemAvailable = itemAvailable;
        this.itemStock = itemStock;
    }
    public Items() {

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

    public Integer getItemStock() {
        return itemStock;
    }

    public void setItemStock(Integer itemStock) {
        this.itemStock = itemStock;
    }

    public void AddItem(Items items){

    }
    public Integer DeleteItem(Items items, Integer number){
        items.itemStock = items.itemStock - number;
        items.setItemStock(items.itemStock);
        if(itemStock == 0){
            items.itemAvailable = false;
        }

        return items.itemStock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
