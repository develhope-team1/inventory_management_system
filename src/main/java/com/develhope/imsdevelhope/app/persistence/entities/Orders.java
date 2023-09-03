package com.develhope.imsdevelhope.app.persistence.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.Collection;

public class Orders {
    @Id
    @GeneratedValue
    public Long orderId;


    @OneToMany
    private final Collection<Items> items = new ArrayList<>();
    private String orderStatus;
}
