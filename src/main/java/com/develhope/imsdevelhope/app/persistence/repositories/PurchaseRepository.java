package com.develhope.imsdevelhope.app.persistence.repositories;

import com.develhope.imsdevelhope.app.persistence.entities.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchases, Long> {

}
