package com.pets.SpringDemoBot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;


@Data
@Entity(name="users")
public class User {

    @Id
    private Long chatId;
    private String firstName;
    private String lastName;
    private String username;
    private Timestamp registeredAt;

}
