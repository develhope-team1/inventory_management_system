package bussiness.services.management;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.action.internal.EntityAction;
import persistence.User;

public class UserManagementService {

    public static void addUser(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory(
                "inventory_management"
        );

        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        User user = new User();
        user.setUsername("kamar");

        manager.persist(user);

        transaction.commit();

    }
}
