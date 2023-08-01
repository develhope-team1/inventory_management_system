package bussiness.services.management;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import persistence.ItemOrder;

public class OrderManagementService {

    public static void main(String[] args) {

        try (EntityManagerFactory factory = Persistence.createEntityManagerFactory("inventory_management")) {

            try (EntityManager manager = factory.createEntityManager()) {

                EntityTransaction transaction = manager.getTransaction();

                transaction.begin();

                ItemOrder itemOrder = new ItemOrder();

                /*persist*/
                manager.persist(itemOrder);

                /*retrieve*/
                ItemOrder itemOrder = manager.createQuery("select item from ItemOrder item ", ItemOrder.class).getSingleResult();


                transaction.commit();

            }

        }
    }

}
