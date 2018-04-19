import java.text.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * kelas ini menjelaskan tentang sistem utama/main pada JHotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class JHotel
{
    /**
     * program utama JHotel
     *
     * @param args argumen
     */
    public static void main (String[] args)
    {
        DatabaseCustomer.addCustomer(new Customer("A", 11, 01,2018));
        DatabaseCustomer.addCustomer(new Customer("B", 12, 02,2018));
        DatabaseCustomer.addCustomer(new Customer("C", 13, 03,2018));
        System.out.println("Data pada Database Customer");

        for(Customer coba1: DatabaseCustomer.getCustomerDatabase()){
            System.out.println(coba1);
        }

        DatabaseHotel.addHotel(new Hotel ("Aston", new Lokasi(11,11,"depan"), 5));
        DatabaseHotel.addHotel(new Hotel ("Bolton", new Lokasi(12,12,"tengah"), 4));
        DatabaseHotel.addHotel(new Hotel ("Carlton", new Lokasi(13,13,"belakang"), 3));

        for(Hotel coba2: DatabaseHotel.getHotelDatabase()){
            System.out.println(coba2);
        }

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A1"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "A2"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "A3"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(4), "A4"));

        for(Room coba3: DatabaseRoom.getRoomDatabase()){
            System.out.println(coba3);
        }

        DatabasePesanan.addPesanan(new Pesanan(21,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(22,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(23,DatabaseCustomer.getCustomer(3)));

        for(Pesanan coba4: DatabasePesanan.getPesananDatabase()){
            System.out.println(coba4);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A1"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "B2"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "D4"));


        for (Pesanan coba5: DatabasePesanan.getPesananDatabase()){
            System.out.println(coba5);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

        for (Pesanan coba6 :DatabasePesanan.getPesananDatabase()){
            System.out.println(coba6);
        }


    }

    public JHotel()
    {

    }
}

