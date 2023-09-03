package com.develhope.imsdevelhope.app.persistence.entities;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;
//import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "ITEMS")
public class Items {
    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "item_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "item_id",
            nullable = false,
            columnDefinition = "INTEGER"
    )
    public Integer itemId;
    @Column(
            name = "item_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    public String itemName;

    @Column(
            name = "item_Description",
            //nullable = false,
            columnDefinition = "TEXT"
    )
    public String itemDescription;
    @Column(
            name = "item_Available",
            nullable = false,
            columnDefinition = "BOOLEAN"
    )
    public boolean itemAvailable;
    @Column(
            name = "item_Stock",
            nullable = false
    )
    public Integer itemStock;



    public Items(Integer itemId, String itemName, boolean itemAvailable, Integer itemStock, String itemDescription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemAvailable = itemAvailable;
        this.itemStock = itemStock;
    }
    public Items() {

    }
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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
