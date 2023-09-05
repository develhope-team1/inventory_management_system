package com.develhope.imsdevelhope.app.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PURCHASES")
public class Purchases {
    public String Cash;
    public String Credit;
    public String HirePurchase;
    public String Loan;
    @Id
    private Long id;

//    @ForeignKey
//    public Integer id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
