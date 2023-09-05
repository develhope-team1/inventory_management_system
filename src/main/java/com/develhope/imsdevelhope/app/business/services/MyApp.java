package com.develhope.imsdevelhope.app.business.services;

import com.develhope.imsdevelhope.app.persistence.repositories.ItemRepository;
import org.apache.http.util.VersionInfo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.develhope.imsdevelhope.app.persistence.entities.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Boolean.TRUE;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
        getData();
    }
//    SpringApplication.Running()
//    @Bean
//    CommandLineRunner commandLineRunner(ItemRepository itemRepository){
//        return args -> {
//            Items phone = new Items(1,"Samsung Phone",TRUE,200);
//            itemRepository.save(phone);
//        };
//    }
    public static void getData () {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims",
                    "root", "Yon1844");

            // here mynewpage is database name, root is username and password

            Statement stmt = con.createStatement();
            System.out.println("stmt  " + stmt);
            ResultSet rs = stmt.executeQuery("select * from items");
            System.out.println("rs  " + rs);
            int count = 1;
            while (rs.next()) {
                String  item = rs.getString("item");
                System.out.println(count  +": " + item);
                count++;

            }

            con.close();
        } catch (Exception e) {
            Logger lgr = Logger.getLogger(VersionInfo.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);

            System.out.println(e.getMessage());
        }


    }
}
