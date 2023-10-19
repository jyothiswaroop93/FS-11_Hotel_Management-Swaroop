package com.geekster.Room.App.repo;

import com.geekster.Room.App.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<Room,Integer> {
}
