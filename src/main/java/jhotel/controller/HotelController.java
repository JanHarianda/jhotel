package jhotel.controller;

import jhotel.Hotel;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.*;
import java.util.*;

public class HotelController {

    @RequestMapping(value="/hotel",method = RequestMethod.GET)
    public ArrayList<Hotel> hotelList() {
        return DatabaseHotel.getHotelDatabase();
    }

    @RequestMapping(value="/hotel/id",method = RequestMethod.GET)
    public Hotel getHotel(int id_hotel){
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return DatabaseHotel.getHotel(id_hotel);
}
}