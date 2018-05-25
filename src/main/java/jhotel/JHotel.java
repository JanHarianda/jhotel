package jhotel;

/**
 * Kelas utama dari package JHotel
 *
 * @author Jan Harianda Barus
 * @version April 26, 2018
 */

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
        Lokasi test1 = new Lokasi(1, 2, "lokasi1");
        Hotel hotel1 = new Hotel("Margocity",test1,5);
        try {
            DatabaseHotel.addHotel(hotel1);
        } catch (HotelSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        Room A101 = new SingleRoom(hotel1, "A101");
        A101.setDailyTariff(50000);
        try {
            DatabaseRoom.addRoom(A101);
        } catch (RoomSudahAdaException test) {
            System.out.println(test.getPesan());
        }

        Room D404 = new PremiumRoom(hotel1, "D404");
        D404.setDailyTariff(69000);
        try {
            DatabaseRoom.addRoom(D404);
        } catch (RoomSudahAdaException test) {
            System.out.println(test.getPesan());
        }

        Room B202 = new DoubleRoom(hotel1, "B202");
        B202.setDailyTariff(100000);
        try {
            DatabaseRoom.addRoom(B202);
        } catch (RoomSudahAdaException test) {
            System.out.println(test.getPesan());
        }

        SpringApplication.run(JHotel.class, args);

    /*try{
            DatabaseHotel.addHotel(new Hotel("Melati", new Lokasi(1, 1, "Taman Melati"), 6));
            DatabaseHotel.addHotel(new Hotel("Mawar", new Lokasi(2, 2, "Taman Mawar"), 5));
        }
        catch(HotelSudahAdaException a)
        {
            a.getPesan();
        }

        try
        {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "ME101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "ME504"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2), "MA401"));
        }
        catch(RoomSudahAdaException a)
        {
            a.getPesan();
        }*/
    }
    public JHotel()
    {
        // initialise instance variables
    }
}
