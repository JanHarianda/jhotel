package jhotel;

/**
 * Kelas utama dari package JHotel
 *
 * @author Jan Harianda Barus
 * @version April 26, 2018
 */

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JHotel
{
    /**
     * Main method dari project
     * @param args digunakan sebagai argumen saat menjalankan program
     */

    public static void main(String args[])
    {
        try{
            DatabaseHotel.addHotel(new Hotel("Melati", new Lokasi(1, 1, "Taman Melati"), 7));
            DatabaseHotel.addHotel(new Hotel("Mawar", new Lokasi(2, 2, "Taman Mawar"), 5));
        }
        catch(HotelSudahAdaException a)
        {
            a.getPesan();
        }

        try
        {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "ME3011"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "ME5024"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2), "MA101"));
        }
        catch(RoomSudahAdaException a)
        {
            a.getPesan();
        }

        SpringApplication.run(JHotel.class, args);
    }

    public JHotel()
    {
        // initialise instance variables
    }
}
