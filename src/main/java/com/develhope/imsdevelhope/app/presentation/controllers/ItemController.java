package com.develhope.imsdevelhope.app.presentation.controllers;

import com.develhope.imsdevelhope.app.business.services.ItemService;
import com.develhope.imsdevelhope.app.persistence.entities.Items;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(value = "/items/add", consumes = {"application/json"})
    @CrossOrigin(methods = RequestMethod.POST,
            origins = {"http://localhost:8080"}
    )
    public ResponseEntity<String> addItem(@RequestBody Items items){
        boolean addItemBool = this.itemService.addItem(items);

        if(!addItemBool){
            return new ResponseEntity<>("Add Item failed", HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>("Adding successful", HttpStatus.OK);
    }
    @GetMapping(value = "/items/get/{id}")
    public  ResponseEntity<Items> getItem(@PathVariable("id") long id){
        Items getItemVar = this.itemService.getItem(id);
        if(getItemVar == null){
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(getItemVar,HttpStatus.OK);
    }

}
