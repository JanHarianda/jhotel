package jhotel;
import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

/**
 * Kelas utama dari package JHotel
 *
 * @author Jan Harianda Barus
 * @version April 26, 2018
 */

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
        try
        {
            DatabaseHotel.addHotel(hotel1);
        } catch (HotelSudahAdaException e)
        {
            System.out.println(e.getPesan());
        }
        Room A101 = new SingleRoom(hotel1, "A101");
        A101.setDailyTariff(50000);
        try
        {
            DatabaseRoom.addRoom(A101);
        } catch (RoomSudahAdaException test)
        {
            System.out.println(test.getPesan());
        }

        Room B202 = new DoubleRoom(hotel1, "B202");
        B202.setDailyTariff(100000);
        try
        {
            DatabaseRoom.addRoom(B202);
        } catch (RoomSudahAdaException test)
        {
            System.out.println(test.getPesan());
        }

        Room C303 = new PremiumRoom(hotel1, "C303");
        C303.setDailyTariff(69000);
        try
        {
            DatabaseRoom.addRoom(C303);
        } catch (RoomSudahAdaException test)
        {
            System.out.println(test.getPesan());
        }

        SpringApplication.run(JHotel.class, args);

    }
    public JHotel()
    {

    }
}
