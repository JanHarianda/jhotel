package jhotel.controller;

import jhotel.DatabaseRoom;
import jhotel.Hotel;
import jhotel.DatabaseHotel;
import jhotel.Room;
import org.springframework.web.bind.annotation.*;
import java.util.*;

public class RoomController {

    @RequestMapping(value="/vacantrooms",method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms() {
        return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping(value="/vacantrooms/id",method = RequestMethod.GET)
    public Hotel getHotel(int id_hotel){
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}