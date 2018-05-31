package jhotel;

import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * class JHotel sebagai class utama
 *
 * @author Fahmi FF
 * @version 20-05-2018
 */
@SpringBootApplication
public class JHotel {
    /**
     * method ini digunakan untuk menjalankan perintah main
     *
     * @param args argumen
     */

    public static void main(String args[]) {
        //menambahkan objek hotel ke database
        try {
            DatabaseHotel.addHotel(new Hotel("Margocity", new Lokasi(1, 2, "Depok"), 6));

        } catch (HotelSudahAdaException e) {
            e.getPesan();
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "S.301"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "D.301"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "D.302"));
        } catch (RoomSudahAdaException e) {
            e.getPesan();
        }

        SpringApplication.run(JHotel.class, args);
    }

    public JHotel() {
        // initialise instance variables
    }
}