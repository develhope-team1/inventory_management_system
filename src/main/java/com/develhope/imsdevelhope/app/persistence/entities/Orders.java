package com.develhope.imsdevelhope.app.persistence.entities;

import jakarta.persistence.*;
import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.Collection;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "ORDERS")
public class Orders {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "order_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    public Long orderId;


    @OneToMany
    private final Collection<Items> items = new ArrayList<>();
    @Column
    private String orderStatus;
    @Column
    private String orderCategory;
    @Column
    private String Salesman;
    @Column
    private Long customerId;

    public Orders() {
    }

    public Orders(Long orderId, String orderStatus, String orderCategory, String salesman, Long customerId) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderCategory = orderCategory;
        Salesman = salesman;
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Collection<Items> getItems() {
        return items;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }

    public String getSalesman() {
        return Salesman;
    }

    public void setSalesman(String salesman) {
        Salesman = salesman;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

}
