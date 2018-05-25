package jhotel.controller;

import jhotel.DatabaseHotel;
import jhotel.DatabaseRoom;
import jhotel.Room;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Class ini digunakan sebagai controller room
 *
 * @author Albertus Ageng
 * @version 2018.05.13
 */

@RestController
public class RoomController {

    /**
     * Request maping untuk localhost:8080/vacantrooms
     *
     * @return kamar kamar dengan status vacant
     */
    @RequestMapping("/vacantrooms")
    public ArrayList<Room> vacantRooms() {
        ArrayList<Room> kamar = DatabaseRoom.getVacantRooms();
        return kamar;
    }

    /**
     * Request maping untuk localhost:8080/databaserooms
     * @return kamar kamar dengan status vacant
     */
    @RequestMapping("/databaserooms")
    public ArrayList<Room> databaseRooms() {
        ArrayList<Room> kamar = DatabaseRoom.getRoomDatabase();
        return kamar;
    }

    /**
     * Request maping untuk localhost:8080/room/idhotel/noroom
     *
     * @param id_hotel id hotel
     * @param room_no nomer kamar
     * @return kamar kamar terpilih
     */
    @RequestMapping("/room/{id_hotel}/{room_no}")
    public Room getHotel(@PathVariable int id_hotel,
                         @PathVariable String room_no) {
        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),room_no);
        return kamar;
    }
}