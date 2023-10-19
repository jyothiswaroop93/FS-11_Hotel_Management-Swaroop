package com.geekster.Room.App.service;

import com.geekster.Room.App.model.Room;
import com.geekster.Room.App.repo.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    IRoomRepo roomRepo;
    public String addroom(Room newroom) {
        roomRepo.save(newroom);
        return "New Room Added";
    }
}
