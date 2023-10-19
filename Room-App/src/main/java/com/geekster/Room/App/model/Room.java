package com.geekster.Room.App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OYO")
public class Room {
    @Id
    private Integer roomId;
    private Integer roomNumber;
    private Type roomType;
    private  boolean roomAvailable;
}
