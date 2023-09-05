package com.develhope.imsdevelhope.app.business.services;

import com.develhope.imsdevelhope.app.persistence.entities.Items;
import com.develhope.imsdevelhope.app.persistence.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public boolean addItem(Items items){
        this.itemRepository.save(items);
        return true;
    }
    public Items getItem(Long id){
        return this.itemRepository.findItemsById(id);
    }
}
