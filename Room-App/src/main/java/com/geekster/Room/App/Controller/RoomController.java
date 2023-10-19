package com.geekster.Room.App.Controller;

import com.geekster.Room.App.model.Room;
import com.geekster.Room.App.service.RoomService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;
    // post api
    @PostMapping("room")
    public String addRoom(@RequestBody Room newroom){
        return roomService.addroom(newroom);
    }


    // get api
}
