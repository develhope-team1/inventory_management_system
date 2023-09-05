package com.develhope.imsdevelhope.app.persistence.repositories;

import com.develhope.imsdevelhope.app.persistence.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Orders, Long> {


}
