package com.develhope.imsdevelhope.app.persistence.repositories;

import com.develhope.imsdevelhope.app.persistence.entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Items, Long> {
    Items findItemsById(Long itemId);

}
