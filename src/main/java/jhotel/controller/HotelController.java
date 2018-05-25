package jhotel.controller;

import jhotel.Hotel;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Class ini digunakan sebagai controller hotel
 *
 * @author Albertus Ageng
 * @version 2018.05.13
 */

@RestController
public class HotelController {

    /**
     * Request maping untuk localhost:8080/hotel
     *
     * @return hotel seluruh database hotel
     */
    @RequestMapping("/hotel")
    public ArrayList<Hotel> hotelsList() {
        ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
        return hotel;
    }

    /**
     * Request maping untuk localhost:8080/hotel/id
     *
     * @param id id hotel
     * @return hotel hotel terpilih
     */
    @RequestMapping("/hotel/{id}")
    public Hotel getHotel(@PathVariable int id) {
        Hotel hotel = DatabaseHotel.getHotel(id);
        return hotel;
    }

}